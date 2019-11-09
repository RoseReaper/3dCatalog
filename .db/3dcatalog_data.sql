USE 3dcatalog;

INSERT INTO SOFTWARE (software_name)
	VALUES("DAZ Studio");
    
INSERT INTO WEBSITE (website_name, website_url)
	VALUES("Renderosity", "http://renderosity.com");
    
INSERT INTO TYPE (type_name)
	VALUES ("Character"),
           ("Clothes");
    
INSERT INTO CONTENT (content_sku, content_name, content_isactive, content_url, content_discriminatortype, type_id)
	VALUES ("6817687168", "Victoria", 1, "http://truc.com", "figure", 1);
    
INSERT INTO FIGURE (content_id)
	VALUES (1);
    
INSERT INTO CONTENT (content_sku, content_name, content_isactive, content_url, content_discriminatortype, type_id)
	VALUES ("697262866", "Long dress", 1, "http://machin.com", "content", 2);