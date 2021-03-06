-- DRAW PLACE COUNT
CREATE VIEW DRAW_PLACE_COUNT AS
SELECT  RACE.VENUE, RACE.COURSE, RACE.DISTANCE, HORSE.DRAW, COUNT(1) AS PLACE_COUNT
FROM RACE_RESULT_HORSE HORSE, RACE_RESULT RACE 
WHERE HORSE.RACE_RESULT_ID = RACE.ID 
AND ( HORSE.PLACE = '1' OR HORSE.PLACE = '2' OR HORSE.PLACE = '3' OR HORSE.PLACE = '1 DH' OR HORSE.PLACE = '2 DH' OR HORSE.PLACE = '3 DH')
GROUP BY RACE.VENUE, RACE.COURSE, RACE.DISTANCE, HORSE.DRAW 
;

-- DRAW PLACE RACE COUNT
CREATE VIEW DRAW_RACE_COUNT AS
SELECT  RACE.VENUE, RACE.COURSE, RACE.DISTANCE, COUNT(1) AS RACE_COUNT
FROM RACE_RESULT RACE 
GROUP BY RACE.VENUE, RACE.COURSE, RACE.DISTANCE
;

-- DRAW PLACE 
CREATE VIEW DRAW_PLACE AS
SELECT RACE.VENUE, RACE.COURSE, RACE.DISTANCE, DRAW.DRAW, DRAW.PLACE_COUNT, RACE.RACE_COUNT, DRAW.PLACE_COUNT  * 100/ RACE.RACE_COUNT AS PLACE_PCT
FROM DRAW_RACE_COUNT RACE, DRAW_PLACE_COUNT DRAW 
WHERE RACE.VENUE = DRAW.VENUE
AND RACE.COURSE = DRAW.COURSE
AND RACE.DISTANCE = DRAW.DISTANCE;


