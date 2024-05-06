package Interface;
 
 /**
  * Parent
  */
 public interface Parent {

    interface MethodsPassed{
       void passedMethod();
    }

    class Child implements Parent {
        public void passedMethod() {
            System.out.println("this method is from the cild class inside the parent");
        }
    
    }
    
}