package dbPath;

import MSV.PCS.C.RequestFilter_C;
import OSI.AOP.MS.VPC.S.hall.DatabaseLog_H;
import VPC.VQS.DSU.utils.DetaDBUtil;
import VPC.VQS.DSU.utils.DetaUtil;

public class I_TableZhongYiFangJi{
	public static void main(String[] argv) throws Exception {
		//init
		DetaUtil.initDB("C:/DBconfig.lyg");
		System.out.println("----����VPCS���ݿ������DMAȷ��:�ɹ���");
		RequestFilter_C.initBlockList();
		System.out.println("----����VPCS���ݿ������IP���˷�������:�ɹ���");
		MS.OP.SM.AOP.MEC.SIQ.cache.DetaDBBufferCache_M.reflection();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DatabaseLog_H.createBinLog_H();
		System.out.println("----����VPCS���ݿ�����������������ӳ�����:�ɹ���");
		DetaDBUtil.initCulumnNameType();
		//
		String plsql= "setRoot:C:/DetaDB1;";
			   plsql+= "baseName:ZYY;"; 
			   plsql+= "tableName:zyfj:create;"+ 
			   		"culumnName:pk:ID:string;"+ 
			   		"culumnName:uk:���:string;"+ 
			   		"culumnName:uk:��֢ҩ��:string;"+ 
			   		"culumnName:uk:��ҩ�ο�:string;"+ 
			   		"culumnName:uk:���˴���:string;"+ 
			   		"culumnName:uk:��֢:string;"+ 
			   		"culumnName:uk:�Ʒ�:string;"+ 
			   		"culumnName:uk:Ӧ��:string;"+ 
			   		"culumnName:uk:ʹ��:string;"+ 
			   		"culumnName:uk:����:string;"+ 
			   		"culumnName:uk:����:string;"+ 
			   		"culumnName:uk:����:string;";
		try {
			ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		}catch(Exception e1) {
			e1.printStackTrace();
		}
	}
}