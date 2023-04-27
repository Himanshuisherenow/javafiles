package interfaces;

public class nested {
    public interface Nested {
        boolean idOdd(int num);

    }
}

    class ckk implements nested.Nested{

        @Override
        public boolean idOdd(int num) {

            return (num&1)==1;
        }


    }


