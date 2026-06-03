SELECT
  DATE_FORMAT(registration_date, '%Y-%m') AS registration_month,
  COUNT(*) AS registration_count
FROM registrations
WHERE registration_date >= CURRENT_DATE - INTERVAL 12 MONTH
GROUP BY DATE_FORMAT(registration_date, '%Y-%m')
ORDER BY registration_month;
