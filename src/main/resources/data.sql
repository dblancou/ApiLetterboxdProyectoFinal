
INSERT INTO genres (name)
VALUES ('Acción'), ('Comedia'), ('Drama'), ('Fantasía'), ('Terror'), ('Misterio'), ('Romance'),
('Suspenso'), ('Ciencia ficción'), ('Western'), ('Documental'), ('Animación'), ('Biografía'),
('Crimen'), ('Historia'), ('Guerra'), ('Aventura'), ('Musical'), ('Deporte') ON DUPLICATE KEY UPDATE name=name;


INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Interstellar', 'A team of explorers travel through a wormhole in space in an attempt to ensure humanity''s survival.', '2014', 'Christopher Nolan', 8.6, 1, 'https://pics.filmaffinity.com/interstellar-366875261-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Inception', 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.', '2010', 'Christopher Nolan', 8.8, 1, 'https://pics.filmaffinity.com/inception-652954101-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('The Shawshank Redemption', 'Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.', '1994', 'Frank Darabont', 9.3, 2, 'https://pics.filmaffinity.com/the_shawshank_redemption-576140557-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('The Godfather', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', '1972', 'Francis Ford Coppola', 9.2, 3, 'https://pics.filmaffinity.com/the_godfather-488102675-large.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Pulp Fiction', 'The lives of two mob hitmen, a boxer, a gangster''s wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', '1994', 'Quentin Tarantino', 8.9, 3, 'https://static.posters.cz/image/750/posters/pulp-fiction-cover-i1288.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Heat', 'A group of professional bank robbers start to feel the heat from police when they unknowingly leave a clue at their latest heist.', '1995', 'Michael Mann', 8.2, 3, 'https://i.etsystatic.com/32739938/r/il/d3a1db/3664569005/il_fullxfull.3664569005_4z8v.jpg');

INSERT INTO films (title, description, year, director, imdb_rating, genre_id, poster_url) VALUES
('Fight Club', 'An insomniac office worker and a devil-may-care soapmaker form an underground fight club that evolves into something much, much more.', '1999', 'David Fincher', 8.8, 3, 'https://pics.filmaffinity.com/fight_club-320750671-mmed.jpg');
