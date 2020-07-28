USE 3dcatalog;

INSERT INTO SOFTWARE (software_name)
	VALUES("DAZ Studio"),
    	  ("Poser"),
		  ("Blender");
          
INSERT INTO WEBSITE (website_name, website_url)
	VALUES("Renderosity", "http://renderosity.com"),
		  ("DAZ 3D", "http://daz3d.com");
    
INSERT INTO TYPE (type_name)
	VALUES ("Character"),
		   ("Animal"),
           ("HDRI"),
		   ("Environment"),
           ("Script"),
           ("Clothes");
           
INSERT INTO GENDER (gender_name)
	VALUES ("Male"),
		   ("Female");
           
INSERT INTO GENERATION (generation_name)
	VALUES ("Genesis"),
		   ("Genesis 2"),
		   ("Genesis 3"),
		   ("Genesis 8");
           
INSERT INTO CREATOR (vendor_name)
	VALUES ("Mousso"),
		   ("ThePhilosopher"),
		   ("Jack Tomalin"),
		   ("HowieFarkes");