package fr.styvelioumba.produits;

import fr.styvelioumba.produits.entities.Produit;
import fr.styvelioumba.produits.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;

    @Test
    public void testCreateProduit(){
        Produit produit=new Produit("HUAWEI 10",700.0,new Date());
        produitRepository.save(produit);
    }

    @Test
    public void testFindProduit(){
        Produit produit=produitRepository.findById(1L).get();
        System.out.println(produit.toString());
    }

    @Test
    public void testUpdateProduit(){
        Produit produit=produitRepository.findById(1L).get();
        produit.setPrix(2000.0);
        produitRepository.save(produit);
        System.out.println(produit);
    }

    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(1L);
    }
    @Test
    public void testFindAllProduits(){
        List<Produit> produits=produitRepository.findAll();

        for (Produit produit:produits) {
            System.out.println(produit.toString());
        }
    }


}
