/*我们当前项目中需要自己写的JavaScript脚本*/


$(function () {
    $("#yiqing_in").click(function () {
        $("#yiqing_in span").attr("class", "active")
        $("#yinqing_out span").attr("class", "")
        // $("#in").css("display", "block")
        // $("#out").css("display", "none")

        $("#in").show()
        $("#out").hide()
        
    })

    $("#yinqing_out").click(function () {
        $("#yinqing_out span").attr("class", "active")
        $("#yiqing_in span").attr("class", "")
        // $("#in").css("display", "none")
        // $("#out").css("display", "block")

        $("#in").hide()
        $("#out").show()
    })

    $("#lab_left").click(function(){
        $(this).attr("class", "lab_left active")
        $("#lab_right").attr("class","lab_left")
    })

    $("#lab_right").click(function(){
        $(this).attr("class","lab_right active")
        $("#lab_left").attr("class","lab_left")
    })
})