SELECT * FROM db_study3.library_mst;

SELECT
	순번,
    도서관명,
    구분,
    도서명,
    저작자,
    출판사,
    발행연도,
    case /*java에서 if문이라고 생각하면 편함*/
		when 발행연도 is null then '2050'
        when 발행연도 = '' then '2090'
        else 발행연도
	end as 발행연도1,
    if(ifnull(발행연도, '') = '', '2023', 발행연도) as 발행연도2, /*발행연도가 만약 null이면 2051로 바꿔라. / 발행연도가 null이면 공백으로 바꿔라! (공백과 null을 같은상태로 만듬.)*/
    nullif(발행연도, '') as 발행연도3, /*ifnull의 반대! 발행연도가 공백이면 null로 바꿔라.*/
    if(청구기호 = '', '기호없음', 청구기호) as 청구기호 /*3항연산자. if(조건, 참인 부분 실행, 거짓인 부분 실행)*/
FROM
	library_mst
WHERE
	-- 발행연도 like '202_'; /*'_' 언더바 => 와일드카드(특정위치하나) / '%' => 앞뒤로 여러개 */ 
    not 발행연도 = '';
    
    
UPDATE library_mst /*null과 빈값은 다르다.*/
SET
	발행연도 = '' /*공백으로 바꿔라 1번.*/
WHERE
	발행연도 = '2009';/*2009를 2번.*/