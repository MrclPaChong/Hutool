package com.example.extra.email;


import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;

/**
 * @author weirdo
 * @version 1.0
 * @date 2020/3/14 23:01
 */
public class EmailTest {


    /**
     * 使用默认配置文件账号
     */
    public static void test1(){
        MailUtil.send("961898003@foxmail.com", "测试1", "邮件来自Hutool测试", false);

    }

    /**
     * 不引用mail.setting配置文件，直接设置账号信息
     */
    public static void test2(){
        /**
         *报错：Exception in thread "main" cn.hutool.extra.mail.MailException: AuthenticationFailedException: 535 Error: authentication failed
         * https://www.cnblogs.com/mikemhm/p/11811647.html
         * 申请授权码：https://jingyan.baidu.com/article/4853e1e551c0441908f7264b.html
         */

        MailAccount account = new MailAccount();
        account.setHost("smtp.yeah.net");
        account.setPort(465);
        account.setSslEnable(true);
        account.setFrom("dchenlei@yeah.net");
        account.setUser("dchenlei");
        //授权码
        account.setPass("MHUORUOCEPCTDMIK");
        MailUtil.send(account, "961898003@qq.com", "测试2", "<h1>邮件来自Hutool测试</h1>", true);
    }

    public static void main(String[] args) {
        test1();
        //test2();
    }
}
