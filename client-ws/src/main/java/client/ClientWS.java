package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversionEuroToDh(11));
        Compte cp = proxy.getCompte(5);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Code=" +cp.getCode());
        System.out.println("Solde=" +cp.getSolde());
        System.out.println("Date Creation=" +cp.getDateCreation());
        System.out.println("---------------------------------------------------------------");
        List<Compte> compteList = proxy.listComptes();
        for (Compte c : compteList) {
            System.out.println("---------------------------------------------------------------");

            System.out.println("Code=" +c.getCode());
            System.out.println("Solde=" +c.getSolde());
            System.out.println("Date Creation=" +c.getDateCreation());
        }

    }
}


