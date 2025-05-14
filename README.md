# TP 2 - Applications web orientées services
Implementer un projet Spring divisé en 3 microservices :

- product-service : permet de récuperer des produits ayant un id, un nom et un poids.
- review-service : permet de récuperer des avis sur les produits, ces avis ont un id, un produit id, un auteur, un sujet et un commentaire.
- product-composition-service : permet de récuperer un objet contenant un produit et son avis (on suppose qu'un produit a un seul avis), il doit faire appel aux deux autres microservices.
