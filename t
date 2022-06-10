WITH
    CASE
        WHEN source_id = 1646380876852959137 THEN 0.27
        WHEN source_id = 6444553505021351249 THEN 0.51
        WHEN source_id = 8353316766112354339 THEN 0.6
        WHEN source_id = 2298047027724683096 THEN 0.19
        WHEN source_id = 158539170207741159 THEN 0.25
        WHEN source_id = 1049629557035799245 THEN 0.25
        WHEN source_id = 9109653256451929345 THEN 0.13
        WHEN source_id = 5350099850056400863 THEN 0.15
        WHEN source_id = 5428250762423550747 THEN 0.6
        WHEN source_id = 1907771805951762286 THEN 0.6
        WHEN source_id = 1528208802414346563 THEN 3.0
        WHEN source_id = 3257981720518066885 THEN 8.0
        WHEN source_id = 412039151974203370 THEN 0.6
        WHEN source_id = 7417187950565198632 THEN 0.6
        WHEN source_id = 6305814112549700255 THEN 0.6
        WHEN source_id = 5720436351023633949 THEN 2.0
        WHEN source_id = 683830272252930909 THEN 1.0
        WHEN source_id = 4852424292236131001 THEN 0.52
        WHEN source_id = 6452600955975982458 THEN 8.0
        WHEN source_id = 517725969906202833 THEN 8.0
        WHEN source_id = 7217689922575584968 THEN 0.55
        WHEN source_id = 3781650737590658145 THEN 0.6
        ELSE 1
    END AS click_weight
SELECT
    doc_id,
    countIf(action_type='show') AS shows,
    sumIf(click_weight, action_type='click') AS clicks,
    CASE
        WHEN age >= 1.0 AND age < 12.0 THEN 1
        WHEN age >= 12.0 AND age < 18.0 THEN 2
        WHEN age >= 18.0 AND age < 25.0 THEN 3
        WHEN age >= 25.0 AND age < 35.0 THEN 4
        WHEN age >= 35.0 AND age < 50.0 THEN 5
        WHEN age >= 50.0 AND age < 80.0 THEN 6
        ELSE 0
    END as age,
    CASE
        WHEN gender = 1 THEN 1
        WHEN gender = 2 THEN 2
        ELSE 0
    END as gender
FROM
    pulse.kafka2ch_distributed
WHERE
    action_type in ('click', 'show') AND
    toYYYYMMDDhhmmss(ts) BETWEEN 20220412201000 AND 20220419201000 AND
    (((stream_id IN ( 'xiaomi_browser','xiaomi_browser_private','xiaomi_browser_with_video','xiaomi_browser_private_with_video', )) AND (split IN ( '0','1','2','3','4','5','8','9','10','11','12','13','14','15','16','17', )) AND (block_label IN ( 'promo', ))) AND (source_id IN (1646380876852959137, 6444553505021351249, 8353316766112354339, 2298047027724683096, 158539170207741159, 1049629557035799245, 9109653256451929345, 5350099850056400863, 5428250762423550747, 1907771805951762286, 1528208802414346563, 3257981720518066885, 412039151974203370, 7417187950565198632, 6305814112549700255, 5720436351023633949, 683830272252930909, 4852424292236131001, 6452600955975982458, 517725969906202833, 7217689922575584968, 3781650737590658145)))
GROUP BY
    doc_id, age, gender
HAVING
    shows >= 100
ORDER BY doc_id