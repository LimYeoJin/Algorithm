-- 코드를 입력하세요
SELECT  APPOINTMENT.APNT_NO, 
        PATIENT.PT_NAME, 
        APPOINTMENT.PT_NO, 
        APPOINTMENT.MCDP_CD,
        DOCTOR.DR_NAME,
        APPOINTMENT.APNT_YMD
FROM APPOINTMENT 
JOIN PATIENT 
ON   APPOINTMENT.PT_NO = PATIENT.PT_NO 
JOIN DOCTOR
ON   APPOINTMENT.MDDR_ID = DOCTOR.DR_ID
WHERE APPOINTMENT.APNT_YMD LIKE '2022-04-13%'
AND    APPOINTMENT.MCDP_CD = 'CS'
AND     APPOINTMENT.APNT_CNCL_YN = 'N' 
ORDER BY APPOINTMENT.APNT_YMD ASC