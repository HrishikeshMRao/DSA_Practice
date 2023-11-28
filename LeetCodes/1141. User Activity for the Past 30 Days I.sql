

# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT
  activity_date AS day,
  COUNT(DISTINCT user_id) AS active_users
FROM activity
WHERE
  activity_date <= '2019-07-27' AND
  activity_date > '2019-06-27'
GROUP BY activity_date;