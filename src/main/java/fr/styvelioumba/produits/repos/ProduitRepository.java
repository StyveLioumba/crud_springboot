package fr.styvelioumba.produits.repos;

import fr.styvelioumba.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {

}
