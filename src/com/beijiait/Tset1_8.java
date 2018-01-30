package com.beijiait;

public class Tset1_8 {

/**
 *创建更新信息
 *
 * @param pd
 * @param num 0为创建,1其他为更新
 */
public void setParameters(PageData pd,int num) {
	//如果传入0为创建时
	if(num==0) {
	pd.put("ID", this.get32UUID());	
	pd.put("IS_DELETE", Const.IS_DELETED_NO);
	pd.put("CREATE_USER_ID", Jurisdiction.getUserID());
	//创建人
	//获取YYYY-MM-DD HH:mm:ss格式,SQL格式化'YYYY-MM-DD HH24:MI:SS'
	pd.put("CREATE_DATE", DateUtil.getTime());
	}
	pd.put("UPDATE_USER_ID", Jurisdiction.getUserID());
	pd.put("UPDATE_DATE", DateUtil.getTime());
}

}
Controller