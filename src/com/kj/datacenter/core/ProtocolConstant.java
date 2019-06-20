
package com.kj.datacenter.core;

public class ProtocolConstant {

	public static final byte FRAME_DELIMITER = 0x7e;

	public static final int STOP_TYPE_BEGIN = 0;
	public static final int STOP_TYPE_END = 1;
	public static final int STOP_TYPE_MIDDLE = 2;

	public static final int GENERAL_RSP_RESULT_SUCCESS = 0x00;
	public static final int GENERAL_RSP_RESULT_FAILURE = 0x01;
	public static final int GENERAL_RSP_RESULT_ERROR = 0x02;

	public static final int MSG_ID_UP_GENERAL_RSP = 0x0601;
	public static final int MSG_ID_UP_HEAR_BIT= 0x0607;
	public static final int MSG_ID_UP_LOGIN_REQ_NEW = 0x0602;
	public static final int MSG_ID_UP_STATUS = 0x0603;
	public static final int MSG_ID_UP_QUERY_AREA_TEMPLATE_RSP = 0x0604;
	public static final int MSG_ID_UP_QUERY_AREA_CONTENT_RSP = 0x0605;
	public static final int MSG_ID_UP_QUERY_SETTING_RSP = 0x0606;
	public static final int MSG_ID_UP_QUERY_STATUS_RSP = 0x0608;

	public static final int MSG_ID_DOWN_GENERAL_RSP = 0x0901;
	public static final int MSG_ID_DOWN_SETUP_SETTING_REQ = 0x0902;
	public static final int MSG_ID_DOWN_QUERY_SETTING_REQ = 0x0903;
	public static final int MSG_ID_DOWN_QUERY_STATUS_REQ = 0x0904;
	public static final int MSG_ID_DOWN_SETUP_AREA_TEMPLATE_REQ = 0x0905;
	public static final int MSG_ID_DOWN_QUERY_AREA_TEMPLATE_REQ = 0x0906;
	public static final int MSG_ID_DOWN_SETUP_AREA_CONTENT_REQ = 0x0907;
	public static final int MSG_ID_DOWN_QUERY_AREA_CONTENT_REQ = 0x0908;
	public static final int MSG_ID_DOWN_DISPLAY_INFO_REQ = 0x0909;
	public static final int MSG_ID_DOWN_SETUP_LINE_STATUS_REQ = 0x090A;
	public static final int MSG_ID_DOWN_SETUP_LINE_TIPS_REQ = 0x090B;
	public static final int MSG_ID_DOWN_SETUP_LINE_TIPS_DISPLAY_REQ = 0x090C;
	public static final int MSG_ID_DOWN_SETUP_LINE_NEXT_REQ = 0x090D;
	public static final int MSG_ID_DOWN_SETUP_FTP_INFO_REQ = 0x090E;

	public static final int MSG_ID_DOWN_PARAM_REQ = 0x090F;
}
