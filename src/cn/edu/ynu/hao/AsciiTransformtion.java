package cn.edu.ynu.hao;

public class AsciiTransformtion {
	
	public String numToChars(String str ){
		if(str.length()%2!=0)str="0"+str;
		char[] strArr=str.toCharArray();
		String res="";
		for(int i=0; i<strArr.length;i=i+2){
			if((int)(strArr[i]-'0')*10+(strArr[i+1]-'0')>93||(int)(strArr[i]-'0')*10+(strArr[i+1]-'0')<0){
				throw new IndexOutOfBoundsException();

			}
			res+=(char)((strArr[i]-'0')*10+(strArr[i+1]-'0')+33);
		}
		return res;
	}
	
	public String charsToNum(String str){
		char[] strArr=str.toCharArray();
		String res="";
		for(int i=0;i<strArr.length;i++){
			if((int)(strArr[i]-33)<0||(int)(strArr[i]-33)>93){
				throw new IndexOutOfBoundsException();
			}
			res+=(int)(strArr[i]-33);
		}
		return res;
	}
	
	public void asciiTransformtion(String str,int type){
		if(type==0){
			System.out.println(numToChars(str));
		}else if(type==1){
			System.out.println(charsToNum(str));

		}else{
			System.out.println("Error Input!");
		}
	}
	

}
