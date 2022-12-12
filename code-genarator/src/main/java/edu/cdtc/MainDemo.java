package edu.cdtc;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

/**
 * @author Zhang Peng
 * @email qianmeng6879@163.com
 * @since ${DATE}
 */
public class MainDemo {
    public static void main(String[] args) {

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/view_data", "root", "mysqladmin")
                .globalConfig(builder -> {
                    builder.author("zero") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://code//generator"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("top.mxzero") // 设置父包名
                            .moduleName("viewdata") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://code//generator")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("member") // 设置需要生成的表名
                            .addInclude("patient")
                            .addInclude("provinceofchina")
                            .addInclude("visit");
                }).execute();

    }
}