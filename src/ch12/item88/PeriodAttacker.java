package ch12.item88;

import java.io.*;
import java.util.Date;

public class PeriodAttacker {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MutablePeriod period = new MutablePeriod(new Date(), new Date());
        MutablePeriod mutablePeriod = mutablePeriod(period);
        System.out.println(mutablePeriod);
        Date end = mutablePeriod.end;
        end.setTime(346343743);
        System.out.println(mutablePeriod);//대박 미쳤다..........시간여행이 가능하다........


        //Date 역직렬화 후 객체 훔쳐서 값 조작 -> Mutable period라는 새로운 객체 생성!!! 값을 바꿔버려!!!
    }

    public static MutablePeriod mutablePeriod(MutablePeriod period) throws IOException, ClassNotFoundException {
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos)){
            oos.writeObject(period);


            byte[] ref = {0x71, 0, 0x7e, 0, 5}; //start 5글자.
            bos.write(ref);
            ref[4] = 4; //end
            bos.write(ref);
            byte[] byteObject = bos.toByteArray();

            try(ByteArrayInputStream bis = new ByteArrayInputStream(byteObject);
                ObjectInputStream in = new ObjectInputStream(bis)) {
                MutablePeriod mutablePeriod = (MutablePeriod) in.readObject();
                Date start =(Date) in.readObject();
                Date end =(Date) in.readObject();
                System.out.println("start : "+ start);
                System.out.println("end : "+ end);


                return mutablePeriod;
            }
        }
    }
}
