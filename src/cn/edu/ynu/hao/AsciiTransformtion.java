package cn.edu.ynu.hao;

import java.util.ArrayList;

public class AsciiTransformtion {
	
	public String numToChars(String str ){
		 char[] chars = str.toCharArray();
	        ArrayList<Integer> numList = new ArrayList<>();
	        for (int i = 0; i< chars.length; i++){
	            numList.add((int)chars[i]-'0');
	        }

	        int num = 0;
	        ArrayList<Integer> quotientList = new ArrayList<>();
	        int quotient = 0;
	        int remainder = 0;
	        ArrayList<Integer> resultList = new ArrayList<>();
	        while(numList.size()>2){
	            for( int i = 0; i < numList.size(); i ++){
	                num = num * 10 + numList.get(i);
	                quotient = num / 94;
	                if(quotient > 0){
	                    quotientList.add(quotient);
	                    remainder = num % 94;
	                    num = remainder;
	                }
	            }
	            resultList.add(remainder);
	            numList = (ArrayList<Integer>)quotientList.clone();
	            quotientList.clear();
	            num = 0;
	        }
	        if(numList.size() == 2){
	            num = numList.get(0) * 10 + numList.get(1);
	            if( num > 93) {
	                resultList.add(numList.get(1) - 4);
	                resultList.add(1);
	            }else
	                resultList.add(num);
	        }else
	            resultList.add(numList.get(0));
	        Integer[] revResult = resultList.toArray(new Integer[resultList.size()]);
	        StringBuffer result = new StringBuffer();
	        int length = revResult.length;

	        for( int i = length - 1; i > -1; i --){
	            result.append((char)(revResult[i]+33));
	        }
	        return result.toString();
	}
	
	public String charsToNum(String str){
		long res=0;
		char[] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++){
			res=res*94+((int)strArray[i]-33);
		}
		return res+"";
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
