package OP.SM.AOP.MEC.SIQ.SM.reflection;
import java.util.concurrent.ConcurrentHashMap;
public class Spec{
	public ConcurrentHashMap<String, String> getCulumnTypes() {
		return culumnTypes;
	}
	public void I_CulumnTypes(ConcurrentHashMap<String, String> culumnTypes) {
		this.culumnTypes = culumnTypes;
	}
	///
	public void I_CulumnType(String culumnName, String culumnType) {
		this.culumnTypes.put(culumnName, culumnType);
	}
	
	public String getCulumnType(String culumnName) {
		if(culumnTypes.containsKey(culumnName)) {
			return culumnTypes.get(culumnName);
		}
		return null;	
	}

	private ConcurrentHashMap<String, String> culumnTypes;
}