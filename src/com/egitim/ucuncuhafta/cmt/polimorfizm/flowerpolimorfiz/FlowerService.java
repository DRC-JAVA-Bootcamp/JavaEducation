package com.egitim.ucuncuhafta.cmt.polimorfizm.flowerpolimorfiz;

import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Flower;
import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Karpuz;
import com.egitim.ikincihafta.pazar.oop.thissuper.bitkihiyerarsi.Rose;

public class FlowerService {

    public void smell(Flower flower){
        if(flower instanceof Rose){
            Rose roseFlower = (Rose) flower;
            roseFlower.smell();
        }else if(flower instanceof Karpuz){
            Karpuz karpuz = (Karpuz) flower;
            karpuz.setAdet(12);
        }
    }
}
