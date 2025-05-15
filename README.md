# TP 2 - Applications web orientées services
1 - Implementer un projet Spring divisé en 4 microservices :

- product-service : permet de récuperer des produits ayant un id, un nom et un poids.
- review-service : permet de récuperer des avis sur les produits, ces avis ont un id, un produit id, un auteur, un sujet et un commentaire.
- recommendation-service : permet de récuperer des recommendations sur les produits, ces avis ont un id, un produit id, un auteur, une note et un commentaire.
- product-composition-service : permet de récuperer un objet contenant un produit et son avis (on suppose qu'un produit a un seul avis), il doit faire appel aux deux autres microservices.


2 - Ajouter un microservice s'occupant de la localisation des services (discovery-service)

3 - Ajouter un microservice qui va gérer les configurations de tous les microservices definis précédement (config-server-service). Repo contenant les config : https://github.com/nathzaf/microservices-tp2-config
