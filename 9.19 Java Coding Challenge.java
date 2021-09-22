
//week of 9.19.2018 challenge

public class MainDriver {
	
	public static void main(String[] args) {
		System.out.println("32GB -> " + actualMemory("32GB"));
		System.out.println("2GB -> " + actualMemory("2GB"));
		System.out.println("512MB -> " + actualMemory("512MB"));
		System.out.println("1GB -> " + actualMemory("1GB"));
	}
	
	public static String actualMemory(String approxMemory) {
		String mem = "";
		
		String unit = approxMemory.substring(approxMemory.length()-2);
		int num = Integer.parseInt(approxMemory.substring(0, approxMemory.length()-2));
		
		if(num == 1) {
			num = 1024;
			unit = "MB";
		}
		
		unit = unit.toUpperCase();
		
		if(unit.equals("GB")) {
			float n = (float)num;
			n = n * 0.93f;
			mem = n + "" + unit;
		}else if(unit.equals("MB")) {
			num = (int)(num * 0.93f);
			mem = num + "" + unit;
		}
		
		return mem;
	}
}