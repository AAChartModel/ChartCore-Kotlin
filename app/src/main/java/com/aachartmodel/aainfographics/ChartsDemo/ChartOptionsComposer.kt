/**
 * Copyright (C), 2015-2019
 * FileName: ChartOptionsComposer
 * Author: ios-fn
 * Date: 2019-06-16 18:56
 * Description:
 * History:
 */
package com.aachartmodel.aainfographics

import com.aachartmodel.aainfographics.AAInfographicsLib.AAOptionsModel.*
import com.example.chartcorekotlin.AAChartConfiger.*
import java.util.HashMap

class ChartOptionsComposer {
    internal fun configureAAPlotBandsForChart(): HashMap<String, Any?> {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Spline)//图形类型
            .dataLabelEnabled(false)
            .markerRadius(0)
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        .color(AAColor.whiteColor())
                        .lineWidth(10.0f)
                )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaPlotBandsElementArr = arrayOf(
            AAPlotBandsElement()
                .from(0f)
                .to(5f)
                .color("#BC2B44"),
            AAPlotBandsElement()
                .from(5f)
                .to(10f)
                .color("#EC6444"),
            AAPlotBandsElement()
                .from(10f)
                .to(15f)
                .color("#f19742"),
            AAPlotBandsElement()
                .from(15f)
                .to(20f)
                .color("#f3da60"),
            AAPlotBandsElement()
                .from(20f)
                .to(25f)
                .color("#9bd040"),
            AAPlotBandsElement()
                .from(25f)
                .to(50f)
                .color("#acf08f")
        )

        val aaYAxis = aaOptions["yAxis"] as HashMap<String, Any>
        aaYAxis["plotBands"] = aaPlotBandsElementArr
        return aaOptions
    }

    internal fun configureAAPlotLinesForChart(): HashMap<String, Any?> {
        val map1 = HashMap<String,Any>()
        map1["value"] = 12
        map1["color"] = "#1e90ff"
        val map2 = HashMap<String,Any>()
        map2["value"] = 24
        map2["color"] = "#ef476f"
        val map3 = HashMap<String,Any>()
        map3["value"] = 36
        map3["color"] = "#04d69f"
        val map4 = HashMap<String,Any>()
        map4["color"] = "#ffd066"
        val zonesArr = arrayOf(map1, map2, map3, map4)

        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Areaspline)//图形类型
            .dataLabelEnabled(false)
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("Tokyo")
                        .data(arrayOf(7.0, 6.9, 2.5, 14.5, 18.2, 21.5, 5.2, 26.5, 23.3, 45.3, 13.9, 9.6))
                        .fillOpacity(0.5f)
                        .lineWidth(10f)
                        .zones(zonesArr)
                )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaPlotLinesElementsArr = arrayOf<AAPlotLinesElement>(
            AAPlotLinesElement()
                .color("#1e90ff")//颜色值(16进制)
                .dashStyle(AAChartLineDashSyleType.LongDashDotDot)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(12f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(
                    AALabel()
                        .text("PLOT LINES ONE")
                        .style(
                            AAStyle()
                                .color("#1e90ff")
                                .fontWeight("bold")
                        )
                ), AAPlotLinesElement()
                .color("#ef476f")//颜色值(16进制)
                .dashStyle(AAChartLineDashSyleType.LongDashDot)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(24f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(
                    AALabel()
                        .text("PLOT LINES TWO")
                        .style(
                            AAStyle()
                                .color("#ef476f")
                                .fontWeight("bold")
                        )
                ), AAPlotLinesElement()
                .color("#1e90ff")//颜色值(16进制)
                .dashStyle(AAChartLineDashSyleType.LongDash)//样式：Dash,Dot,Solid等,默认Solid
                .width(1f) //标示线粗细
                .value(36f) //所在位置
                .zIndex(1) //层叠,标示线在图表中显示的层叠级别，值越大，显示越向前
                .label(
                    AALabel()
                        .text("PLOT LINES THREE")
                        .style(
                            AAStyle()
                                .color("#04d69f")
                                .fontWeight("bold")
                        )
                )
        )

        val aaYAxis = aaOptions["yAxis"] as HashMap<String, Any>?
        aaYAxis!!["plotLines"] = aaPlotLinesElementsArr
        return aaOptions
    }

    internal fun customAATooltipWithJSFuntion():HashMap<*, *> {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Area)//图形类型
            .title("近三个月金价起伏周期图")//图表主标题
            .subtitle("金价(元/克)")//图表副标题
            .symbolStyle(AAChartSymbolStyleType.BorderBlank)//折线连接点样式为外边缘空白
            .dataLabelEnabled(false)
            .categories(arrayOf("10-01", "10-02", "10-03", "10-04", "10-05", "10-06", "10-07", "10-08", "10-09", "10-10", "10-11", "10-12", "10-13", "10-14", "10-15", "10-16", "10-17", "10-18", "10-19", "10-20", "10-21", "10-22", "10-23", "10-024", "10-25", "10-26", "10-27", "10-28", "10-29", "10-30", "10-31", "11-01", "11-02", "11-03", "11-04", "11-05", "11-06", "11-07", "11-08", "11-09", "11-10", "11-11", "11-12", "11-13", "11-14", "11-15", "11-16", "11-17", "11-18", "11-19", "11-20", "11-21", "11-22", "11-23", "11-024", "11-25", "11-26", "11-27", "11-28", "11-29", "11-30", "12-01", "12-02", "12-03", "12-04", "12-05", "12-06", "12-07", "12-08", "12-09", "12-10", "12-11", "12-12", "12-13", "12-14", "12-15", "12-16", "12-17", "12-18", "12-19", "12-20", "12-21", "12-22", "12-23", "12-024", "12-25", "12-26", "12-27", "12-28", "12-29", "12-30"))
            .series(arrayOf(AASeriesElement()
                .name("2020")
                .lineWidth(3f)
                .color("#FFD700"/*纯金色*/)
                .fillOpacity(0.5f)
                .data(arrayOf(1.51, 6.7, 0.94, 1.44, 1.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.51, 12.7, 0.94, 1.44, 18.6, 1.63, 1.56, 1.91, 2.45, 3.87, 3.24, 4.90, 4.61, 4.10, 4.17, 3.85, 4.17, 3.46, 3.46, 3.55, 3.50, 4.13, 2.58, 2.28, 1.33, 4.68, 1.31, 1.10, 13.9, 1.10, 1.16, 1.67, 2.64, 2.86, 3.00, 3.21, 4.14, 4.07, 3.68, 3.11, 3.41, 3.25, 3.32, 3.07, 3.92, 3.05, 2.18, 3.24, 3.23, 3.15, 2.90, 1.81, 2.11, 2.43, 5.59, 3.09, 4.09, 6.14, 5.33, 6.05, 5.71, 6.22, 6.56, 4.75, 5.27, 6.02, 5.48))))

        val aaTooltip = AATooltip()
            .useHTML(true)
            .formatter("""
function () {
        return ' 🌕 🌖 🌗 🌘🌑 🌒 🌓 🌔 <br/> '
        + ' Support JavaScript Function Just Right Now !!! <br/> '
        + ' The Gold Price For <b>2020 '
        +  this.x
        + ' </b> Is <b> '
        +  this.y
        + ' </b> Dollars ';
        }
""")
            .valueDecimals(2)//设置取值精确到小数点后几位//设置取值精确到小数点后几位
            .backgroundColor("#000000")
            .borderColor("#000000")
            .style(
                AAStyle()
                .color("#FFD700")
                .fontSize("12 px")
            )
        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        aaOptions["tooltip"] = aaTooltip
        return aaOptions
    }

    internal fun customXAxisCrosshairStyle(): HashMap<*, *> {
        val aaChartModel = AAChartModel()
            .chartType(AAChartType.Line)//图表类型
            .series(
                arrayOf(
                    AASeriesElement()
                        .name("2020")
                        .color(AAGradientColor.deepSeaColor())
                        .data(
                            arrayOf(
                                arrayOf(12464064, 21.5),
                                arrayOf(12464928, 22.1),
                                arrayOf(12465792, 23.2),
                                arrayOf(12466656, 23.8),
                                arrayOf(12467520, 21.4),
                                arrayOf(12468384, 21.3),
                                arrayOf(12469248, 18.3),
                                arrayOf(12470112, 15.4),
                                arrayOf(12470976, 16.4),
                                arrayOf(12471840, 17.7),
                                arrayOf(12472704, 17.5),
                                arrayOf(12473568, 17.6),
                                arrayOf(12474432, 17.7),
                                arrayOf(12475296, 16.8),
                                arrayOf(12476160, 17.7),
                                arrayOf(12477024, 16.3),
                                arrayOf(12477888, 17.8),
                                arrayOf(12478752, 18.1),
                                arrayOf(12479616, 17.2),
                                arrayOf(12480480, 14.4),
                                arrayOf(12481344, 13.7),
                                arrayOf(12482208, 15.7),
                                arrayOf(12483072, 14.6),
                                arrayOf(12483936, 15.3),
                                arrayOf(12484800, 15.3),
                                arrayOf(12485664, 15.8),
                                arrayOf(12486528, 15.2),
                                arrayOf(12487392, 14.8),
                                arrayOf(12488256, 14.4),
                                arrayOf(12489120, 15.5),
                                arrayOf(12489984, 13.6)
                            )
                        )
                )
            )

        val aaOptions = AAOptionsConstructor.configureChartOptions(aaChartModel)
        val aaCrosshair = AACrosshair()
            .color(AAColor.redColor())
            .width(1f)
            .dashStyle(AAChartLineDashSyleType.LongDashDotDot)
        val aaXAxis = aaOptions["xAxis"] as HashMap<String, Any>
        aaXAxis["crosshair"] = aaCrosshair
        return aaOptions
    }


}