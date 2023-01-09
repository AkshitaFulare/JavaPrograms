package multiLevelInheritance;

public class FullTime {
	
 private long basicSal;
 private long dA;
  
 FullTime()
 {
	
 }
 FullTime(long basicSal)
 {
	 this.basicSal = basicSal;
 }
 FullTime(long basicSal,long dA)
 {
	 this.basicSal = basicSal;
	 this.dA = dA;
 }
 public void SetBasicSal(long basicSal)
 {
	 this.basicSal = basicSal;
 }
 public void setDa(long dA)
 {
	 this.dA = dA;
 }
 public long getBasicSal()
 {
	 return basicSal;
 }
 public long getDa()
 {
	 return dA;
 }
}
