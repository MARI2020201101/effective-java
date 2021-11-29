package ch02.item8;

import ch02.item5.ChocoSupplier;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class WeakReferenceTester {
    public static void main(String[] args) throws InterruptedException {
        ChocoSupplier chocoSupplier = new ChocoSupplier();
        WeakReference<ChocoSupplier> chocoSupplierWeakReference = new WeakReference<>(chocoSupplier);
        System.out.println(chocoSupplierWeakReference.get());

        chocoSupplier=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(chocoSupplierWeakReference.get());
        //weak reference의 경우, weak reference에 의해 참조되고 있지만 없애버린다
        System.out.println("--------------------------------");

        ChocoSupplier chocoSupplier2 = new ChocoSupplier();
        Reference<ChocoSupplier> chocoSupplierReference = new SoftReference<>(chocoSupplier2);
        System.out.println(chocoSupplierReference.get());
        chocoSupplier2=null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(chocoSupplierReference.get());
        //soft reference 의 경우, 해당 객체가 null 이 되어 사실상 참조가 없어졌어도
        //soft reference 에의해 참조되고있는 것으로 간주되어 gc의 대상이 되지 않는

        //이러한 reachability 는 5가지 종류가 있고 이에 따라서 gc의 처리대상인가 아닌가가 결정된다
        //즉, 애플리케이션 단에서는 reachability를 조절하여 gc의 행동에 관여할수있게된다...!!!!끄오오아와오우왕

    }
}
