class Box
{
  double width, height, length;

  Box(double w, double h, double l)
   {
     width=w;
     height=h;
     length=l;
   }

  public boolean equals(Object obj)
   {
     if(obj  instanceof  Box)
      {
         if( (((Box)obj).width==this.width) && (((Box)obj).height==this.height) && (((Box)obj).length==this.length) )
                                              return true;
         else
                                              return false;
      }
     else
                          return false;
   }
}

class InstanceofBox2
{
  public static void main(String args[ ])
   {
     Box b1=new Box(10, 11, 12);
     Box b2=new Box(20, 21, 22);
     Box b3=new Box(10, 11, 12);

     System.out.println(b1.equals(b2));		//f(different dimensions)
     System.out.println(b1.equals(b3));		//t(bcz same dimensions)
   }
}

/*
O/P:
false
true
*/