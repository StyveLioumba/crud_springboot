package fr.styvelioumba.produits.services;

import fr.styvelioumba.produits.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit produit);
    Produit updateProduit(Produit produit);
    Produit getProduit(Long id);
    void deleteProduit(Produit produit);
    void deleteProduitById(Long id);
    List<Produit> getAllProduits();
}
