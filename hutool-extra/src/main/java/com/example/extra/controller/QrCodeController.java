package com.example.extra.controller;


import com.example.extra.response.BaseResponse;
import com.example.extra.utils.QrCodeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weirdo
 * @version 1.0
 * @date 2020/3/10 18:22
 */
@RestController
public class QrCodeController {


    /**
     * 生成二维码
     * @return
     */
    @RequestMapping(value = "ErWeiMa")
    public BaseResponse ErWeiMa(){
        try {
            QrCodeUtils.ErWeiMa();
            return new BaseResponse(200,"二维码生成成功");
        } catch (Exception e) {

            return new BaseResponse(402,"二维码生成失败");
        }
    }

}
