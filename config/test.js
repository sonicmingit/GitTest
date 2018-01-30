
<input type="text" id="time" value="" />
<button onclick="getTime()">获取时间</button>


//计算出相差天数  
function getTime() {
	//开始时间
    var dateStart = $("#dateStart").val();
    //结束时间
    var dateEnd = $("#dateEnd").val();
    //时间差的毫秒数  
    var dateDiff = new Date(dateEnd).getTime() - new Date(dateStart).getTime();     
    //计算相差天数
    var day = parseInt(dateDiff/(24*60*60*1000));//取整剩余天数
    //计算相差小时数(天数后)
	var hour = parseInt((dateDiff/(60*60*1000))%24);//取整剩余小时，然后再取余数
	//计算相差分钟数(小时后)
	var mim = parseInt((left/60)%60);
	//计算相差秒数(分钟后)
	var seconds = parseInt(left%60); 
}