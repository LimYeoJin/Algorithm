WITH RECURSIVE HOURS AS (
    SELECT 0 AS HOUR UNION ALL SELECT HOUR+1
    FROM HOURS
    WHERE HOUR < 23)

SELECT HOURS.HOUR AS HOUR, COUNT(ANIMAL_ID) AS 'COUNT'
FROM ANIMAL_OUTS 
RIGHT JOIN    HOURS
ON  HOURS.HOUR = HOUR(DATETIME)
GROUP BY HOUR
ORDER BY HOUR ASC