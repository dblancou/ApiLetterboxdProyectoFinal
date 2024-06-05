
INSERT INTO genres (name)
VALUES ('Acción'), ('Comedia'), ('Drama'), ('Fantasía'), ('Terror'), ('Misterio'), ('Romance'),
('Suspenso'), ('Ciencia ficción'), ('Western'), ('Documental'), ('Animación'), ('Biografía'),
('Crimen'), ('Historia'), ('Guerra'), ('Aventura'), ('Musical'), ('Deporte') ON DUPLICATE KEY UPDATE name=name;


INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Interestelar', 'Un equipo de exploradores viaja a través de un agujero de gusano en el espacio en un intento por asegurar la supervivencia de la humanidad.', '2014', 'Christopher Nolan', 8.6, 1, 'https://pics.filmaffinity.com/interstellar-366875261-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Origen', 'Un ladrón que roba secretos corporativos utilizando una tecnología de compartir sueños recibe la tarea inversa de plantar una idea en la mente de un CEO.', '2010', 'Christopher Nolan', 8.8, 1, 'https://pics.filmaffinity.com/inception-652954101-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Cadena perpetua', 'Dos hombres encarcelados se vinculan a lo largo de varios años, encontrando consuelo y eventual redención a través de actos de decencia común.', '1994', 'Frank Darabont', 9.3, 2, 'https://pics.filmaffinity.com/the_shawshank_redemption-576140557-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El padrino', 'El envejecido patriarca de una dinastía del crimen organizado transfiere el control de su imperio clandestino a su reacio hijo.', '1972', 'Francis Ford Coppola', 9.2, 3, 'https://pics.filmaffinity.com/the_godfather-488102675-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Pulp Fiction', 'Las vidas de dos sicarios, un boxeador, la esposa de un gánster y un par de bandidos de cafetería se entrelazan en cuatro relatos de violencia y redención.', '1994', 'Quentin Tarantino', 8.9, 3, 'https://static.posters.cz/image/750/posters/pulp-fiction-cover-i1288.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Heat', 'Un grupo de ladrones de bancos profesionales comienza a sentir la presión de la policía cuando, sin saberlo, dejan una pista en su último atraco.', '1995', 'Michael Mann', 8.2, 3, 'https://i.etsystatic.com/32739938/r/il/d3a1db/3664569005/il_fullxfull.3664569005_4z8v.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El club de la lucha', 'Un oficinista insomne y un fabricante de jabón despreocupado forman un club de lucha clandestino que evoluciona en algo mucho más.', '1999', 'David Fincher', 8.8, 3, 'https://pics.filmaffinity.com/fight_club-320750671-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El caballero oscuro', 'Cuando la amenaza conocida como el Joker emerge de su misterioso pasado, causa estragos y caos en las personas de Gotham.', '2008', 'Christopher Nolan', 9.0, 1, 'https://pics.filmaffinity.com/the_dark_knight-102763119-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Forrest Gump', 'Las presidencias de Kennedy y Johnson, la guerra de Vietnam, el escándalo de Watergate y otros eventos históricos se desarrollan desde la perspectiva de un hombre de Alabama con un CI de 75.', '1994', 'Robert Zemeckis', 8.8, 2, 'https://posters.movieposterdb.com/12_04/1994/109830/l_109830_58524cd6.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('La lista de Schindler', 'En la Polonia ocupada por los nazis durante la Segunda Guerra Mundial, Oskar Schindler se preocupa cada vez más por sus trabajadores judíos después de presenciar su persecución por parte de los nazis.', '1993', 'Steven Spielberg', 9.0, 3, 'https://pics.filmaffinity.com/schindler_s_list-473662617-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El señor de los anillos: El retorno del rey', 'Gandalf y Aragorn lideran el Mundo de los Hombres contra el ejército de Sauron para desviar su mirada de Frodo y Sam mientras se acercan al Monte del Destino con el Anillo Único.', '2003', 'Peter Jackson', 8.9, 4, 'https://pics.filmaffinity.com/the_lord_of_the_rings_the_return_of_the_king-178294596-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El padrino: Parte II', 'La vida temprana y la carrera de Vito Corleone en la Nueva York de los años 20 se muestra mientras su hijo, Michael, expande y fortalece su control sobre su sindicato del crimen.', '1974', 'Francis Ford Coppola', 10.0, 3, 'https://m.media-amazon.com/images/I/51rOnIjLqzL._AC_SY679_.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Mad Max: Furia en la carretera', 'En un páramo post-apocalíptico, Max se une a Furiosa para escapar de un tirano y su ejército.', '2015', 'George Miller', 8.1, 1, 'https://pics.filmaffinity.com/mad_max_fury_road-429261909-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Jungla de cristal', 'Un oficial de la NYPD intenta salvar a su esposa y a varios otros que han sido tomados como rehenes por terroristas alemanes durante una fiesta de Navidad.', '1988', 'John McTiernan', 8.2, 1, 'https://pics.filmaffinity.com/die_hard-336213173-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Matrix', 'Un hacker descubre la impactante verdad sobre su realidad y su papel en la guerra contra sus controladores.', '1999', 'Lana Wachowski, Lilly Wachowski', 8.7, 1, 'https://pics.filmaffinity.com/the_matrix-155050517-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Gladiator', 'Un ex general romano busca vengarse del corrupto emperador que asesinó a su familia y lo envió a la esclavitud.', '2000', 'Ridley Scott', 8.5, 1, 'https://pics.filmaffinity.com/gladiator-331143379-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Terminator 2: El juicio final', 'Un cyborg, idéntico al que no logró matar a Sarah Connor, ahora debe proteger a su hijo adolescente de un cyborg más avanzado.', '1991', 'James Cameron', 8.5, 1, 'https://pics.filmaffinity.com/t2_terminator_2_judgment_day-825143697-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Aliens: El regreso', 'Ellen Ripley es rescatada por un equipo de salvamento después de estar en hipersueño durante 57 años. La luna que el Nostromo visitó ha sido colonizada, pero se ha perdido el contacto. Esta vez, los marines coloniales tienen un impresionante poder de fuego, ¿pero será suficiente?', '1986', 'James Cameron', 8.4, 1, 'https://pics.filmaffinity.com/aliens-989223912-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('John Wick', 'Un ex asesino a sueldo sale de su retiro para perseguir a los gánsteres que mataron a su perro y le quitaron todo.', '2014', 'Chad Stahelski', 7.4, 1,
'https://pics.filmaffinity.com/john_wick-166872838-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Léon: El profesional', 'Mathilda, una niña de 12 años, es acogida a regañadientes por Léon, un asesino profesional, después de que su familia es asesinada. Una relación inusual se forma cuando ella se convierte en su protegida y aprende el oficio de asesino.', '1994', 'Luc Besson', 8.5, 1, 'https://pics.filmaffinity.com/leon_leon-207548886-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Malditos bastardos', 'En la Francia ocupada por los nazis, un grupo de soldados judío-estadounidenses, conocidos como "Los Bastardos", son seleccionados específicamente para infundir miedo en el Tercer Reich mediante el escalpado y asesinato brutal de nazis.', '2009', 'Quentin Tarantino', 8.3, 1, 'https://pics.filmaffinity.com/inglourious_basterds-976286054-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Psicosis', 'Una secretaria de Phoenix malversa $40,000 del cliente de su empleador, se fuga y se registra en un motel remoto administrado por un joven bajo la dominación de su madre.', '1960', 'Alfred Hitchcock', 8.4, 5, 'https://pics.filmaffinity.com/psycho-805182707-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El silencio de los corderos', 'Una joven cadete del FBI debe confiar en un asesino encarcelado y manipulador para recibir su ayuda en la captura de otro asesino en serie que desolla a sus víctimas.', '1991', 'Jonathan Demme', 8.6, 5, 'https://pics.filmaffinity.com/the_silence_of_the_lambs-767447992-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El resplandor', 'Una familia se dirige a un hotel aislado para el invierno donde una presencia siniestra influye en el padre hacia la violencia, mientras su hijo psíquico ve terribles premoniciones del pasado y del futuro.', '1980', 'Stanley Kubrick', 8.4, 5, 'https://pics.filmaffinity.com/the_shining-453129380-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Alien, el octavo pasajero', 'Después de que una nave mercante espacial recibe una transmisión desconocida como una llamada de auxilio, uno de los tripulantes es atacado por una misteriosa forma de vida y pronto se dan cuenta de que su ciclo de vida apenas ha comenzado.', '1979', 'Ridley Scott', 8.4, 5, 'https://pics.filmaffinity.com/alien-657278575-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El exorcista', 'Cuando una niña de 12 años es poseída por una entidad misteriosa, su madre busca la ayuda de dos sacerdotes para salvarla.', '1973', 'William Friedkin', 8.0, 5, 'https://pics.filmaffinity.com/the_exorcist-742137399-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('La semilla del diablo', 'Una joven pareja se muda a un nuevo apartamento, solo para estar rodeada de vecinos peculiares y sucesos extraños. Cuando la esposa queda misteriosamente embarazada, la paranoia sobre la seguridad de su hijo no nacido comienza a controlar su vida.', '1968', 'Roman Polanski', 8.0, 5, 'https://pics.filmaffinity.com/rosemary_s_baby-673657233-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Nosferatu', 'El Conde Drácula expresa interés en una nueva residencia y la esposa del agente inmobiliario Hutter.', '1922', 'F.W. Murnau', 8.0, 5, 'https://pics.filmaffinity.com/nosferatu_eine_symphonie_des_grauens-257840643-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Los pájaros', 'Una adinerada socialité de San Francisco persigue a un potencial novio hasta un pequeño pueblo del norte de California que lentamente toma un giro hacia lo bizarro cuando todo tipo de aves comienzan a atacar a las personas.', '1963', 'Alfred Hitchcock', 7.8, 5, 'https://pics.filmaffinity.com/alfred_hitchcock_s_the_birds-851609530-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El sexto sentido', 'Un niño que se comunica con espíritus busca la ayuda de un psicólogo infantil desilusionado.', '1999', 'M. Night Shyamalan', 8.1, 5, 'https://pics.filmaffinity.com/the_sixth_sense-516003703-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Drácula de Bram Stoker', 'El antiguo vampiro Conde Drácula llega a Inglaterra para seducir a la prometida de su abogado Jonathan Harker, Mina Murray, y sembrar el caos en la tierra extranjera.', '1992', 'Francis Ford Coppola', 7.6, 5, 'https://pics.filmaffinity.com/bram_stoker_s_dracula-420186556-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Metrópolis', 'En una ciudad futurista dividida entre la clase trabajadora y los planificadores de la ciudad, el hijo del cerebro de la ciudad se enamora de una profetisa de la clase trabajadora que predice la llegada de un salvador para mediar en sus diferencias.', '1927', 'Fritz Lang', 8.2, 9, 'https://pics.filmaffinity.com/metropolis-434117468-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Dune', 'Adaptación de la novela de ciencia ficción de Frank Herbert, sobre el hijo de una familia noble encargada de proteger el activo más valioso y el elemento más vital de la galaxia.', '2021', 'Denis Villeneuve', 8.0, 9, 'https://pics.filmaffinity.com/dune-209834814-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Regreso al futuro', 'Marty McFly, un estudiante de secundaria de 17 años, es enviado accidentalmente treinta años al pasado en un DeLorean viajero en el tiempo inventado por su amigo cercano, el excéntrico científico Doc Brown.', '1985', 'Robert Zemeckis', 8.5, 9, 'https://pics.filmaffinity.com/back_to_the_future-100822308-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Terminator', 'Un soldado humano es enviado desde 2029 a 1984 para detener a una máquina de matar cibernética casi indestructible, enviada desde el mismo año, que ha sido programada para ejecutar a una joven cuyo hijo no nacido es la clave para la futura salvación de la humanidad.', '1984', 'James Cameron', 8.0, 9, 'https://pics.filmaffinity.com/the_terminator-778052251-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Parque Jurásico', 'Durante una visita previa, un parque temático sufre una gran falla en el sistema de energía que permite que sus exhibiciones de dinosaurios clonados se descontrolen.', '1993', 'Steven Spielberg', 8.1, 9, 'https://pics.filmaffinity.com/jurassic_park-187298880-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El quinto elemento', 'En un colorido futuro, un taxista se convierte sin querer en la figura central en la búsqueda de un legendario arma cósmica para mantener a raya al mal y al señor Zorg.', '1997', 'Luc Besson', 7.7, 9, 'https://pics.filmaffinity.com/the_fifth_element_le_cinquieme_element-198425470-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('E.T. el extraterrestre', 'Un niño con problemas reúne el coraje para ayudar a un amistoso extraterrestre a escapar de la Tierra y regresar a su mundo natal.', '1982', 'Steven Spielberg', 7.9, 9, 'https://pics.filmaffinity.com/e_t_the_extra_terrestrial-391240254-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('La guerra de los mundos', 'Una versión actualizada del clásico de ciencia ficción de H.G. Wells sobre una invasión alienígena que amenaza el futuro de la humanidad.', '2005', 'Steven Spielberg', 6.5, 9, 'https://pics.filmaffinity.com/war_of_the_worlds-353489914-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Ex Machina', 'Un joven programador es seleccionado para participar en un experimento pionero en inteligencia sintética evaluando las cualidades humanas de una avanzada A.I. humanoide.', '2014', 'Alex Garland', 7.7, 9, 'https://pics.filmaffinity.com/ex_machina-368494509-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Blade Runner', 'Un blade runner debe perseguir y eliminar a cuatro replicantes que robaron una nave en el espacio y han regresado a la Tierra para encontrar a su creador.', '1982', 'Ridley Scott', 8.1, 9, 'https://pics.filmaffinity.com/blade_runner-351607743-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El viaje de Chihiro', 'Durante la mudanza de su familia a los suburbios, una niña de 10 años se adentra en un mundo gobernado por dioses, brujas y espíritus, donde los humanos se transforman en bestias.', '2001', 'Hayao Miyazaki', 8.1, 12, 'https://pics.filmaffinity.com/sen_to_chihiro_no_kamikakushi-348587850-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Mary y Max', 'Una historia de amistad entre dos improbables amigos por correspondencia: Mary, una niña solitaria de ocho años que vive en los suburbios de Melbourne, y Max, un hombre de cuarenta y cuatro años severamente obeso que vive en Nueva York.', '2009', 'Adam Elliot', 8.1, 12, 'https://pics.filmaffinity.com/mary_and_max-528932806-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('La tumba de las luciérnagas', 'Un niño y su pequeña hermana luchan por sobrevivir en Japón durante la Segunda Guerra Mundial.', '1988', 'Isao Takahata', 8.0, 12, 'https://pics.filmaffinity.com/hotaru_no_haka_aka_grave_of_the_fireflies_aka-128332096-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Coco', 'El aspirante a músico Miguel, confrontado con la prohibición ancestral de su familia contra la música, entra en la Tierra de los Muertos para encontrar a su tatarabuelo, un legendario cantante.', '2017', 'Lee Unkrich, Adrian Molina', 8.0, 12, 'https://pics.filmaffinity.com/coco-155051069-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('La princesa Mononoke', 'En un viaje para encontrar la cura para la maldición de un Tatarigami, Ashitaka se encuentra en medio de una guerra entre los dioses del bosque y Tatara, una colonia minera.', '1997', 'Hayao Miyazaki', 8.0, 12, 'https://pics.filmaffinity.com/mononoke_hime-598406013-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El rey león', 'El príncipe león Simba y su padre son objetivos de su amargado tío, que desea ascender al trono.', '1994', 'Roger Allers, Rob Minkoff', 7.9, 12, 'https://pics.filmaffinity.com/the_lion_king-983881776-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Toy Story 3', 'Los juguetes son entregados por error a una guardería en lugar del ático justo antes de que Andy se vaya a la universidad, y depende de Woody convencer a los otros juguetes de que no fueron abandonados y regresar a casa.', '2010', 'Lee Unkrich', 7.9, 12, 'https://pics.filmaffinity.com/toy_story_3-691147043-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Up', 'Carl Fredricksen, un hombre de setenta y ocho años, viaja a Cataratas del Paraíso en su casa equipada con globos, llevando inadvertidamente a un joven polizón.', '2009', 'Pete Docter, Bob Peterson', 7.9, 12, 'https://pics.filmaffinity.com/up-672315222-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Persépolis', 'Una precoz y expresiva niña iraní crece durante la Revolución Islámica.', '2007', 'Marjane Satrapi, Vincent Paronnaud', 7.8, 12, 'https://pics.filmaffinity.com/persepolis-701715841-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El castillo ambulante', 'Cuando una joven insegura es maldecida con un cuerpo anciano por una bruja rencorosa, su única oportunidad de romper el hechizo reside en un joven mago inseguro y sus compañeros en su castillo ambulante.', '2004', 'Hayao Miyazaki', 7.8, 12, 'https://pics.filmaffinity.com/hauru_no_ugoku_shiro-376386887-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Seven', 'Dos detectives, un novato y un veterano, cazan a un asesino en serie que utiliza los siete pecados capitales como sus motivos.', '1995', 'David Fincher', 8.3, 8, 'https://pics.filmaffinity.com/seven_se7en-734875211-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Prisioneros', 'Cuando la hija de Keller Dover y su amiga desaparecen, él toma el asunto en sus propias manos mientras la policía persigue múltiples pistas y la presión aumenta.', '2013', 'Denis Villeneuve', 8.1, 8, 'https://pics.filmaffinity.com/prisoners-721879978-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Reservoir Dogs', 'Después de un simple robo de joyas que sale terriblemente mal, los criminales sobrevivientes comienzan a sospechar que uno de ellos es un informante de la policía.', '1992', 'Quentin Tarantino', 8.1, 8, 'https://pics.filmaffinity.com/reservoir_dogs-904905830-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Perdida', 'Con la desaparición de su esposa convirtiéndose en el foco de un intenso circo mediático, un hombre ve cómo los reflectores se vuelven hacia él cuando se sospecha que podría no ser inocente.', '2014', 'David Fincher', 8.1, 8, 'https://pics.filmaffinity.com/gone_girl-544341973-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('El topo', 'En los sombríos días de la Guerra Fría, el veterano de espionaje George Smiley es sacado del semi-retiro para descubrir a un agente soviético dentro del MI6.', '2011', 'Tomas Alfredson', 7.5, 8, 'https://pics.filmaffinity.com/tinker_tailor_soldier_spy-642430739-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Shutter Island', 'En 1954, un mariscal de los EE.UU. investiga la desaparición de una asesina que escapó de un hospital para criminales dementes.', '2010', 'Martin Scorsese', 8.2, 8, 'https://pics.filmaffinity.com/shutter_island-215721197-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Cisne negro', 'Una bailarina comprometida lucha por mantener su cordura después de ganar el papel principal en una producción de "El lago de los cisnes" de Tchaikovsky.', '2010', 'Darren Aronofsky', 8.0, 8, 'https://pics.filmaffinity.com/black_swan-861293346-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('The Game', 'Nicholas Van Orton, un banquero adinerado, recibe la oportunidad de participar en un juego que se integra con su vida real, llevando a consecuencias inesperadas y peligrosas.', '1997', 'David Fincher', 7.8, 8, 'https://pics.filmaffinity.com/the_game-132318919-mmed.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Contagio', 'Profesionales de la salud, funcionarios del gobierno y personas comunes se encuentran en medio de una epidemia mundial mientras los CDC trabajan para encontrar una cura.', '2011', 'Steven Soderbergh', 6.7, 8, 'https://pics.filmaffinity.com/contagion-952852460-mmed.jpg');






