
function cherkBlur(){
    // alert("hagli");

    // 学号
    var sValue = document.getElementById("sno");
    if(sValue.value.length < 4 || sValue.value.length > 10){
        document.getElementById("snoError").innerHTML = "<em style='color: red;'>学号由4-10位数组成</em>";
        sValue.focus();
        return false;
    }else{
        document.getElementById("snoError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 姓名js
    var uValue = document.getElementById("sname");
    if(uValue.value.length < 2 || uValue.value.length > 8){
        //alert("用户");
        document.getElementById("snameError").innerHTML = "<em style='color: red;'>姓名由2-8位组成</em>";
        uValue.focus();
        return false;
    }else{
        /*var username = $.trim($("#user").val());
        $.ajax({
            type:"POST",   //http请求方式
            url:"<spring:url value="/login/username/isExist" />", //发送给服务器的url
            data:"username="+username, //发送给服务器的参数
            dataType:"json",  //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
            complete : function(msg) {
                var result = eval("(" + msg.responseText + ")");
                if(result.success) {
                    $("#showResult").html(result.message);
                } else {
                    $("#showResult").html(result.message);
                }
            }
        });*/
        document.getElementById("snameError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 密码js
    var regs = /^[a-zA-Z0-9]+$/;
    var pValue = document.getElementById("spassword");
    if(pValue.value.length < 6
        || uValue.value.length > 10
        || !regs.test(pValue.value)){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("passwordError").innerHTML = "<em style='color: red;'>密码由6-10位字符组成</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("passwordError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 确认密码
    var rpValue = document.getElementById("repassword");
    if(rpValue.value != pValue.value){
        document.getElementById("repasswordError").innerHTML = "<em style='color: red;'>与上面密码不符</em>";
        rpValue.focus();
        return false;
    }else {
        document.getElementById("repasswordError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    /*// 用户类型
    var selUser = document.getElementById("choose");
    //alert(selUser.selectedIndex+"");
    if(selUser.selectedIndex == 0) {
        document.getElementById("chooseError").innerHTML = "<em style='color: red;'>没有选择用户类型</em>";
        selUser.focus();
        return false;
    }else {
        document.getElementById("chooseError").innerHTML = "<em style='color: blue;'>OK</em>";
    }*/

    // 性别
    var sexNum = document.getElementsByName("csex");
    var flag = 0;  // 标记
    for(var i = 0; i < sexNum.length; i++) {
        if(sexNum[i].checked == true) {
            flag = 1;
        }
    }
    if(flag == 0){
        document.getElementById("csexError").innerHTML = "<em style='color: red;'>必选项</em>";
        sexNum.focus();
        return false;
    }else {
        document.getElementById("csexError").incnerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 年龄
    var sageNum = document.getElementById("cage");
    console.log(sageNum.value);
    var age = parseInt(sageNum.value);
    console.log(age);
    if(age < 14 || age > 24){
        // alert("hello");
        console.log(age);
        console.log("hello");
        document.getElementById("cageError").innerHTML = "<em style='color: red;'>年龄在14到24之间</em>";
        sageNum.focus();
        return false;
    }else {
        document.getElementById("cageError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 地址
    var sValue = document.getElementById("caddress");
    if(sValue.value.length < 0){
        document.getElementById("caddressError").innerHTML = "<em style='color: red;'>地址不能为空</em>";
        sValue.focus();
        return false;
    }else if(sValue.value.length > 50){
        document.getElementById("caddressError").innerHTML = "<em style='color: red;'>地址不能超过50字</em>";
        sValue.focus();
        return false;
    }else{
        document.getElementById("caddressError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
   /* // 电话js
    var regs = /^[0-9]*$/;
    var pValue = document.getElementById("cphone");
    console.log(pValue.value.length);
    if(pValue.value.length != 12
        || !regs.test(pValue.value)){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("cphoneError").innerHTML = "<em style='color: red;'>电话必须由12位数字构成</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("cphoneError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 症状js
    var pValue = document.getElementById("csymptom");
    console.log(pValue.value.length);
    if(pValue.value.length < 0
        || pValue.value.length > 50){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("csymptomError").innerHTML = "<em style='color: red;'>症状不能超过50字</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("csymptomError").innerHTML = "<em style='color: blue;'>OK</em>";
    }

    // 日期js
    var pValue = document.getElementById("cdate");
    if(pValue.value == null || pValue.value == ""){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("cdateError").innerHTML = "<em style='color: red;'>日期必填</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("cdateError").innerHTML = "<em style='color: blue;'>OK</em>";
    }*/

    /*// 系别
    var sdept = document.getElementById("sdept");
    /!*if(sage < 14 || sage > 24){
        document.getElementById("sageError").innerHTML = "<em style='color: red;'>年龄在14到24之间</em>";
        return false;
    }else {
        document.getElementById("sexError").innerHTML = "<em style='color: blue;'>OK</em>";
    }*!/
    document.getElementById("sdeptError").innerHTML = "<em style='color: blue;'>OK</em>";
    /!*
    //出生日期
    var date = document.getElementById("birthday");
    if(date.value == "") {
        document.getElementById("birthdayError").innerHTML = "<em style='color: red;'>必填项</em>";
        date.focus();
        return false;
    }else {
        document.getElementById("birthdayError").innerHTML = "<em style='color: blue;'>OK</em>";
    }*!/
    // 电话js
    var regs = /^[0-9]*$/;
    var pValue = document.getElementById("aphone");
    console.log(pValue.value.length);
    if(pValue.value.length != 12
        || !regs.test(pValue.value)){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("aphoneError").innerHTML = "<em style='color: red;'>电话必须由12位数字构成</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("aphoneError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
    // 备注js
    var pValue = document.getElementById("remark");
    console.log(pValue.value.length);
    if(pValue.value.length < 5 || pValue.value.length > 50){
        //alert(regs.test(pValue.value)+"");
        document.getElementById("aremarkError").innerHTML = "<em style='color: red;'>备注由5到50个字构成</em>";
        pValue.focus();
        return false;
    }else{
        document.getElementById("aremarkError").innerHTML = "<em style='color: blue;'>OK</em>";
    }
*/

};

// function cherkBlur(){
//     //alert("hagli");
//     // 用户js
//     var uValue = document.getElementById("user");
//     if(uValue.value.length < 6 || uValue.value.length > 18){
//         //alert("用户");
//         document.getElementById("userError").innerHTML = "<em style='color: red;'>用户名由6-18位组成</em>";
//         uValue.focus();
//         return false;
//     }else{
//         var username = $.trim($("#user").val());
//         $.ajax({
//             type:"POST",   //http请求方式
//             url:"<spring:url value="/login/username/isExist" />", //发送给服务器的url
//             data:"username="+username, //发送给服务器的参数
//             dataType:"json",  //告诉JQUERY返回的数据格式(注意此处数据格式一定要与提交的controller返回的数据格式一致,不然不会调用回调函数complete)
//             complete : function(msg) {
//                 var result = eval("(" + msg.responseText + ")");
//                 if(result.success) {
//                     $("#showResult").html(result.message);
//                 } else {
//                     $("#showResult").html(result.message);
//                 }
//             }
//         });
//     }
//     // 密码js
//     var regs = /^[a-zA-Z0-9]+$/;
//     var pValue = document.getElementById("password");
//     if(pValue.value.length < 6
//         || uValue.value.length > 18
//         || !regs.test(pValue.value)){
//         //alert(regs.test(pValue.value)+"");
//         document.getElementById("passwordError").innerHTML = "<em style='color: red;'>密码由6-18位字符组成</em>";
//         pValue.focus();
//         return false;
//     }else{
//         document.getElementById("passwordError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 确认密码
//     var rpValue = document.getElementById("repassword");
//     if(rpValue.value != pValue.value){
//         document.getElementById("repasswordError").innerHTML = "<em style='color: red;'>与上面密码不符</em>";
//         rpValue.focus();
//         return false;
//     }else {
//         document.getElementById("repasswordError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 用户类型
//     var selUser = document.getElementById("choose");
//     //alert(selUser.selectedIndex+"");
//     if(selUser.selectedIndex == 0) {
//         document.getElementById("chooseError").innerHTML = "<em style='color: red;'>没有选择用户类型</em>";
//         selUser.focus();
//         return false;
//     }else {
//         document.getElementById("chooseError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     // 性别
//     var sexNum = document.getElementsByName("sex");
//     var flag = 0;  // 标记
//     for(var i = 0; i < sexNum.length; i++) {
//         if(sexNum[i].checked == true) {
//             flag = 1;
//         }
//     }
//     if(flag == 0){
//         document.getElementById("sexError").innerHTML = "<em style='color: red;'>必选项</em>";
//         return false;
//     }else {
//         document.getElementById("sexError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //电子邮箱
//     var eValue = document.getElementById("email");
//     var pattern = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
//     if(eValue.length == 0 || !pattern.test(eValue.value)) {
//         //alert("sdfsd");
//         document.getElementById("emailError").innerHTML = "<em style='color: red;'>邮箱格式错误</em>";
//         eValue.focus();
//         return false;
//     }else {
//         document.getElementById("emailError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //出生日期
//     var date = document.getElementById("birthday");
//     if(date.value == "") {
//         document.getElementById("birthdayError").innerHTML = "<em style='color: red;'>必填项</em>";
//         date.focus();
//         return false;
//     }else {
//         document.getElementById("birthdayError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
//     //自我介绍
//     var introduce = document.getElementById("introduce");
//     if(introduce.value == "") {
//         document.getElementById("introduceError").innerHTML = "<em style='color: red;'>必填项</em>";
//         introduce.focus();
//         return false;
//     }else if(introduce.value.length < 100){
//         document.getElementById("introduceError").innerHTML = "<em style='color: red;'>内容不少于100字</em>";
//         introduce.focus();
//         return false;
//     }else {
//         document.getElementById("introduceError").innerHTML = "<em style='color: blue;'>OK</em>";
//     }
// };