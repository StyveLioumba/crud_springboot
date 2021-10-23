package fr.styvelioumba.produits.services;

import fr.styvelioumba.produits.entities.Produit;
import fr.styvelioumba.produits.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService{
    @Autowired
    private ProduitRepository repository;

    @Override
    public Produit saveProduit(Produit produit) {
        return repository.save(produit);
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return repository.save(produit);
    }

    @Override
    public Produit getProduit(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteProduit(Produit produit) {
        repository.delete(produit);
    }

    @Override
    public void deleteProduitById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Produit> getAllProduits() {
        return repository.findAll();
    }
}
