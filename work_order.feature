Feature: Gestion des ordres de travail TechniciensDApp

  Scenario: Traitement complet d'un OT terrain
    Given le technicien est authentifié
    When il remplit un ordre de travail
    And le client signe
    Then l'ordre de travail est envoyé au manager
