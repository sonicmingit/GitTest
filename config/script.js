/*script.js文件内容*/
include("tools.js");//JS通用方法
include("check.js");//JS校验方法
include("list.js");//JS列表方法
/**
 * 导入其他JS文件的方法
 * @param path 要导入JS文件地址
 */
function include(path){
	document.write("<script language='javascript' src='static/base/js/"+path+"'></script>");
}