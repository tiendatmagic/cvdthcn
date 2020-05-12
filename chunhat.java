import java.io.*;
import java.util.Scanner;
public class chunhat{
int a,b,cv,dt;
public chunhat(String ten){

System.out.println("Nhap chieu dai:");
Scanner aa = new Scanner(System.in);
a=aa.nextInt();

System.out.println("Nhap chieu rong:");
Scanner bb = new Scanner(System.in);
b=bb.nextInt();

}

public void kiemtradk( ){
if(a<=0 || b<=0){
System.out.println("Day khong phai hinh chu nhat");
a=0;
b=0;
}
else
{
System.out.println("Day la mot hinh chu nhat");
}
}

public void cvdt( ){
cv=a+b;
dt=a*b;	
	
}


public int ketqua( ){
System.out.println("Chu vi la:" + cv );
System.out.println("Dien tich la:" + dt );
return cv;
}
public static void main(String []args){

chunhat tg = new chunhat("");

tg.kiemtradk( );
tg.cvdt( );
tg.ketqua();
}
}