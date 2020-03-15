package com.example.extra.utils;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.File;

/**
 * @author weirdo
 * @version 1.0
 * @date 2020/3/10 18:55
 */
public class QrCodeUtils {




    public static void ErWeiMa(){

        //创建获取电脑系统桌面对象
        FileSystemView fsv = FileSystemView.getFileSystemView();
        //1、获取<“桌面“>路径方法
        File desktopPath=fsv.getHomeDirectory();

        //创建二维码对象,设置二维码大小
        QrConfig config = new QrConfig(300, 300);
        // 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
        // 设置前景色，既二维码颜色（青色）
        config.setForeColor(Color.CYAN.black);
        // 设置背景色（灰色）
        config.setBackColor(Color.GRAY.white);
        //附带logo小图标
        config.setImg(desktopPath+"//QQQ.jpg");

        // 高纠错级别
        config.setErrorCorrection(ErrorCorrectionLevel.H);

        // 生成二维码到文件，也可以到流
        QrCodeUtil.generate("https://www.zhihu.com/question/376947739/answer/1060043434", config, FileUtil.file(desktopPath+"//qrcode.jpg"));

    }

}
