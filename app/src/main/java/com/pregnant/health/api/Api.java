/**
 * Copyright (C) 2015. Keegan小钢（http://keeganlee.me）
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pregnant.health.api;

/**
 * Api接口
 */
public interface Api {

    /**
     * 测试环境地址
     */
//    String HOST = "http://101.201.30.232:8080/pregnant/";
//    String HOST = "http://192.168.1.2:8080/pregnant/";
//    String HOST = "http://221.221.180.255:8080/pregnant/";
    String HOST = "http://test.kpjkgl.com:8090/pregnant/";
    /**
     * 图片地址
     */
    String HOST_PIC = "http://resource.mplus.net.cn/";


    // 用户登陆
    String LOGIN = HOST + "/user/login";
    // 用户注册
    String REGISTER = HOST + "/user/register";
    // 用户信息完善/修改用户信息
    String EDIT = HOST + "/user/edit";
    // 上传用户检查信息
    String UPLOAD = HOST + "/data/upload2";
    // 下载数据字典
    String DICT_DOWNLOAD = HOST + "/data/dict/download";

    // 查询广告列表
    String OTHER_AD = "https://api.mplus.net.cn/mplus/app/other/ad";
}
