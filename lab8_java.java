class BThread implements Runnable{
String n;
int interval,times;
Thread thread;
BThread(String name,int intervals,int t){
n=name;
interval=intervals;
times=t;
thread=new Thread(this,name);
thread.start();
}
public void run(){
try{
for(int i=0;i<times;i++){
System.out.println(n);
Thread.sleep(interval);
}
}
catch(Exception e){
System.out.println("Fail");
}
}
}

class Lab_8{
public static void main(String args[]) throws Exception{
new BThread("BMS College of Engineering",10000,3);
new BThread("CSE",2000,15);
}
}
