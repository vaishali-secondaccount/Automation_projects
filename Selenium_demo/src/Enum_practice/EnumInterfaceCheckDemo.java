package Enum_practice;

interface Student {
    void printname();
    void city();
}
enum StudInfo implements Student {
    PRASENJIT {
        @Override
        public void printname() {
            System.out.println("Name: Prasenjit");
        }

		@Override
		public void city() {
			// TODO Auto-generated method stub
			
		}
      
    };
    
}

public class EnumInterfaceCheckDemo {
    public static void main(String[] args) {
        StudInfo s = StudInfo.PRASENJIT;
        s.name();
        s.city();
    }
}
