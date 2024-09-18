-- 코드를 입력하세요
SELECT
       CATEGORY,
       PRICE AS 'MAX_PRICE',
       PRODUCT_NAME
FROM
        FOOD_PRODUCT
WHERE
        PRICE IN 
        (
        SELECT MAX(PRICE)
            FROM FOOD_PRODUCT
            GROUP BY CATEGORY
        )
        AND CATEGORY REGEXP('식용유|과자|김치|국')
GROUP BY
        CATEGORY
ORDER BY PRICE DESC 