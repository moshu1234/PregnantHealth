package com.pregnant.health.ui.activity;

import com.pregnant.health.R;
import com.pregnant.health.base.BaseActivity;
import com.pregnant.health.utils.ChartUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.InjectView;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.Column;
import lecho.lib.hellocharts.model.ColumnChartData;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.SubcolumnValue;
import lecho.lib.hellocharts.view.ColumnChartView;
import lecho.lib.hellocharts.view.LineChartView;

/**
 * 指导方案
 * Created by cws on 2016/3/24.
 */
public class GuideLinesActivity extends BaseActivity {

    @InjectView(R.id.chart_column)
    ColumnChartView chart_column;
    @InjectView(R.id.chart_line)
    LineChartView chart_line;

    private ColumnChartData dataColumn;
    private LineChartData dataLine;
    private boolean hasAxes = true;
    private boolean hasAxesNames = true;
    private boolean hasLabels = false;
    private boolean hasLabelForSelected = false;

    private int numberOfLines = 1;
    private int maxNumberOfLines = 4;
    private int numberOfPoints = 12;
    float[][] randomNumbersTab = new float[maxNumberOfLines][numberOfPoints];

    private boolean hasLines = true;
    private boolean hasPoints = true;

    @Override
    protected int getLayoutView() {
        return R.layout.act_guide_lines;
    }

    @Override
    public int getTitleName() {
        return R.string.title_guidelines;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {
        generateLineValues();
        generateLineData();
        generateSubcolumnsData();
    }

    private void generateLineValues() {
        for (int i = 0; i < maxNumberOfLines; ++i) {
            for (int j = 0; j < numberOfPoints; ++j) {
                randomNumbersTab[i][j] = (float) Math.random() * 100f;
            }
        }
    }

    private void generateLineData() {

        List<Line> lines = new ArrayList<Line>();
        for (int i = 0; i < numberOfLines; ++i) {

            List<PointValue> values = new ArrayList<PointValue>();
            for (int j = 0; j < numberOfPoints; ++j) {
                values.add(new PointValue(j, randomNumbersTab[i][j]));
            }

            Line line = new Line(values);
            line.setColor(ChartUtils.COLORS[i]);
            line.setHasLabels(hasLabels);
            line.setHasLabelsOnlyForSelected(hasLabelForSelected);
            line.setHasLines(hasLines);
            line.setHasPoints(hasPoints);
//            if (pointsHaveDifferentColor){
//                line.setPointColor(ChartUtils.COLORS[(i + 1) % ChartUtils.COLORS.length]);
//            }
            lines.add(line);
        }

        dataLine = new LineChartData(lines);

        if (hasAxes) {
            Axis axisX = new Axis();
            Axis axisY = new Axis().setHasLines(true);
            if (hasAxesNames) {
                axisX.setName("Axis X");
                axisY.setName("Axis Y");
            }
            dataLine.setAxisXBottom(axisX);
            dataLine.setAxisYLeft(axisY);
        } else {
            dataLine.setAxisXBottom(null);
            dataLine.setAxisYLeft(null);
        }

        dataLine.setBaseValue(Float.NEGATIVE_INFINITY);
        chart_line.setLineChartData(dataLine);

    }

    /**
     * Generates columns with subcolumns, columns have larger separation than subcolumns.
     */
    private void generateSubcolumnsData() {
        int numSubcolumns = 4;
        int numColumns = 4;
        // Column can have many subcolumns, here I use 4 subcolumn in each of 8 columns.
        List<Column> columns = new ArrayList<Column>();
        List<SubcolumnValue> values;
        for (int i = 0; i < numColumns; ++i) {

            values = new ArrayList<SubcolumnValue>();
            for (int j = 0; j < numSubcolumns; ++j) {
                values.add(new SubcolumnValue((float) Math.random() * 50f + 5, ChartUtils.pickColor()));
            }

            Column column = new Column(values);
            column.setHasLabels(hasLabels);
            column.setHasLabelsOnlyForSelected(hasLabelForSelected);
            columns.add(column);
        }

        dataColumn = new ColumnChartData(columns);

        if (hasAxes) {
            Axis axisX = new Axis();
            Axis axisY = new Axis().setHasLines(true);
            if (hasAxesNames) {
                axisX.setName("Axis X");
                axisY.setName("Axis Y");
            }
            dataColumn.setAxisXBottom(axisX);
            dataColumn.setAxisYLeft(axisY);
        } else {
            dataColumn.setAxisXBottom(null);
            dataColumn.setAxisYLeft(null);
        }

        chart_column.setColumnChartData(dataColumn);

    }
}
