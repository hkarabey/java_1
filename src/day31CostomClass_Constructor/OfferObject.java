package day31CostomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class OfferObject {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

offer1.setInfo("usa","amazon","sdet",115,true,false,true,true);
        offer2.setInfo("germany","enote","sdet",120,true,true,true,false);
        offer3.setInfo("LOCAL","amazon","BA",100,true,true,false,true);
        offer4.setInfo("LOCAL","SONY","SM",90,true,true,true,false);
        offer5.setInfo("TURKEY","SIEMENS","PO",85,false,true,true,true);
        offer6.setInfo("CALİFORNİA","SONY","PM",114,true,false,true,true);
        offer7.setInfo("LOCAL","APPLE","DEV",76,false,true,true,false);




        Offer[] offers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};
        ArrayList<Offer> fullTimeOffer = new ArrayList<>();
        System.out.println("---------------");

        for (Offer offer : offers) {
            if (offer.isFullTime){
                fullTimeOffer.add(offer);
            }
        }

        System.out.println(fullTimeOffer);

        ArrayList<Offer>offers1=new ArrayList<>();
        offers1.addAll(Arrays.asList(offers));
        offers1.removeIf(each-> each.isFullTime==false);
        System.out.println(offers1);
        System.out.println("-----------------");

        ArrayList<Offer>localOffer=new ArrayList<>(Arrays.asList(offers));

       localOffer.removeIf((p->!p.locatıon.toLowerCase().equals("local")));
        System.out.println(localOffer);
        System.out.println("-----------------");

        ArrayList<Offer>WithBenefits=new ArrayList<>(Arrays.asList(offers));
        WithBenefits.removeIf(p->!(p.hasBenefit==true&&p.hasPTO==true));
        System.out.println(WithBenefits);
        System.out.println("---------------");

        ArrayList<Offer>sdetOffer=new ArrayList<>(Arrays.asList(offers));
        sdetOffer.removeIf(p->!p.jobTıtle.toLowerCase().equals("sdet"));
        System.out.println(sdetOffer);
        System.out.println("------------------");

        ArrayList<Offer>offersWith100k=new ArrayList<>(Arrays.asList(offers));
        offersWith100k.removeIf(p->p.salary<100);
        System.out.println(offersWith100k);


    }

}
