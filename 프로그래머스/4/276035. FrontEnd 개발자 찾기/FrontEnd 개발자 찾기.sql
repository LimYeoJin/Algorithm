-- 코드를 작성해주세요
SELECT DISTINCT DEVELOPERS.ID, DEVELOPERS.EMAIL, DEVELOPERS.FIRST_NAME, DEVELOPERS.LAST_NAME
  FROM SKILLCODES SKILLCODES 
      ,DEVELOPERS DEVELOPERS 
WHERE SKILLCODES.CODE & DEVELOPERS.SKILL_CODE = SKILLCODES.CODE
  AND CATEGORY = 'Front End'
ORDER BY DEVELOPERS.ID





