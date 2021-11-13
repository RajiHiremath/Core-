class LIndex{
public static void main(String[] args) {

      
		int row=Integer.parseInt(args[0]);
		
		int col=Integer.parseInt(args[1]);
      LIndex sq=new LIndex();
	  sq.squareMatrix(row,col);
   }
     void squareMatrix(int r,int c){
		 int n=5;
	 int mid=(r/2)+1;
	 if(r%2!=0)
	{
	 for(int row = 1;row <=r;row++){
	  for(int col = 1;col<=c;col++){
		 
		  if(row>=mid && col>=mid){
	  
	 
	  System.out.print(row+""+col+"\t");
	  }else {
		  System.out.print("\t");
	  }
	  
	  }
	   System.out.println();
	 
  }
	 }

}
}