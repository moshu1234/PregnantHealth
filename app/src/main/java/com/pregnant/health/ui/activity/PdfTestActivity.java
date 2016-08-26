package com.pregnant.health.ui.activity;

//public class PdfTestActivity extends Activity {
//    private Button btn_select;
//    private Handler handler;
//    private ProgressDialog dialog;
//    private String urlpath = "http://bjbgp02.baidupcs.com/file/f860d5bcb6b807e75f2cf5129a903ca6?bkt=p3-1400f860d5bcb6b807e75f2cf5129a903ca6efd6869500000001f0fa&fid=4046550701-250528-509683183019073&time=1470881822&sign=FDTAXGERLBH-DCb740ccc5511e5e8fedcff06b081203-n3goqB%2B4IjPmOiqZoHTbTIbyBTU%3D&to=fbjbgp&fm=Yan,B,G,bs&sta_dx=0&sta_cs=0&sta_ft=pdf&sta_ct=0&fm2=Yangquan,B,G,bs&newver=1&newfm=1&secfm=1&flow_ver=3&pkey=1400f860d5bcb6b807e75f2cf5129a903ca6efd6869500000001f0fa&sl=70713422&expires=8h&rt=sh&r=750976455&mlogid=5181937768564094462&vuk=4046550701&vbdid=144948565&fin=ww.pdf&fn=ww.pdf&slt=pm&uta=0&rtype=1&iv=0&isw=0&dp-logid=5181937768564094462&dp-callid=0.1.1";
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout_pdf_test);
//        dialog = new ProgressDialog(this);
//        btn_select = (Button) findViewById(R.id.btn_select);
//        btn_select.setOnClickListener(new OnClickListener() {
//            public void onClick(View v) {
//                dialog.setTitle("正在联网下载数据...");
//                dialog.setMessage("请稍后...");
//                dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//
//                dialog.setTitle("请稍后...");
//
//                dialog.setMessage("正在下载数据，请稍等....");
//
//                dialog.setProgress(0);
//
//                dialog.setIndeterminate(false);
//
//                dialog.setCancelable(true);
//                dialog.show();
//
//                handler = new Handler() {
//                    public void handleMessage(android.os.Message msg) {
//                        dialog.cancel();
//                        dialog.setProgress(0);
//                    }
//                };
//
//                loadDataThreah ldt = new loadDataThreah();
//                ldt.start();
//            }
//        });
//
//    }
//
//    /**
//     * 进度条线程
//     */
//    class loadDataThreah extends Thread {
//        public void run() {
//            try {
//                showPDF(urlpath);
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            handler.sendEmptyMessage(0);
//        }
//    }
//
//
//    public void showPDF(String urlpath) throws Exception {
//        URL u = new URL(urlpath);
//        String path = createDir("test.pdf");
//        byte[] buffer = new byte[1024 * 8];
//        int read;
//        int ava = 0;
//        long start = System.currentTimeMillis();
//        BufferedInputStream bin;
//        try {
//            HttpURLConnection urlcon = (HttpURLConnection) u.openConnection();
//            double fileLength = (double) urlcon.getContentLength();
//            bin = new BufferedInputStream(u.openStream());
//            BufferedOutputStream bout = new BufferedOutputStream(
//                    new FileOutputStream(path));
//            while ((read = bin.read(buffer)) > -1) {
//                bout.write(buffer, 0, read);
//                ava += read;
//                int a = (int) Math.floor((ava / fileLength * 100));
//                dialog.setProgress(a);
//                long speed = ava / (System.currentTimeMillis() - start);
//            }
//            bout.flush();
//            bout.close();
//            Uri uri = Uri.parse(path);
//            Intent intent = new Intent(PdfTestActivity.this,
//                    MuPDFActivity.class);
//            intent.setAction(Intent.ACTION_VIEW);
//            intent.setData(uri);
//            startActivity(intent);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private String createDir(String filename) {
//        File sdcardDir = Environment.getExternalStorageDirectory();
//
//        String path = sdcardDir.getPath() + "/MyMobileDownlod";
//        File path1 = new File(path);
//        if (!path1.exists())
//            path1.mkdirs();
//        path = path + "/" + filename;
//        return path;
//    }
//
//
//}
