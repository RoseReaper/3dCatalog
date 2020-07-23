USE 3dcatalog;

INSERT INTO SOFTWARE (software_name)
	VALUES("DAZ Studio"),
    	  ("Poser"),
		  ("Blender");
          
INSERT INTO WEBSITE (website_name, website_url)
	VALUES("Renderosity", "http://renderosity.com"),
		  ("DAZ Studio", "http://daz3d.com");
    
INSERT INTO TYPE (type_name)
	VALUES ("Character"),
           ("Clothes");
    
INSERT INTO FIGURE (content_id)
	VALUES (1);
           
INSERT INTO GENDER (gender_name)
	VALUES ("Male"),
		   ("Female");
           
INSERT INTO GENERATION (generation_name)
	VALUES ("Genesis 8"),
		   ("Genesis 6");
           
INSERT INTO CONTENT (content_sku, content_name, content_isactive, content_url, content_discriminatortype, type_id)
	VALUES ("6817687168", "Victoria", 1, "http://truc.com", "figure", 1),
		   ("697262866", "Long dress", 1, "http://machin.com", "content", 2);
           
INSERT INTO belongs_to (generation_id, figure_id)
	VALUES (1, 1);
           
INSERT INTO is_compatible_with (content_id, software_id)
	VALUES (1, 1),
		   (1, 2),
           (2, 1),
           (2, 2),
           (2, 3);