# unit8

- Polar Coordinates
- Polar Form of Complex numbers

## Goal

- By the end of this Unit, you will be able to:
  - Examine the principles of polar coordinates.
  - Use polar form to work with complex numbers.
  - Construct graphs of polar coordinates.

## Task

- [x] Peer assess Unit 7 Written Assignment
- [x] Reading assignment
- [ ] Discussion Forum
  - [x] first post
  - [ ] reply classmates
- [x] Programming assignmet
- [ ] Learning Journal
- [ ] Take Self-Quiz

### Reading Assignment

- Section 9.1 Solving Trigonometric Equations with Identities
- Section 9.2 Sum and Difference Identities
- Section 9.3 Double-Angle, Half-Angle, and Reduction Formulas
- Section 10.3 Polar Coordinates
- Section 10.4 Polar Coordinates: Graphs
  - Section 10.5 Polar Form of Complex Numbers

### Discussion Forum

How can De Moivre's theorem be described? What is the scope of this theorem? Give two examples for roots and two examples for powers.
質問の前提として複素平面について扱います。ここまでのユニットでは点(x,y)をプロットすることができるx-y平面について学んできまいた。x-y平面以外にも、点となるパラメータを表現することができるものとして、極座標形と複素平面があります。ここで、複素平面上の点z=z+iyを考えます。極座標形への変換は以下の関係を利用すると行うことができます。
x=rcosθ
y=rsinθ
r=sqrt(x^2+y^2)
よって、任意の点zは極座標形では、z=r(cosθ+isinθ)と表現することが可能です。また、テキストから極座標系の関係として二つを得ることができます。
𝑧1𝑧2=𝑟1𝑟2[cos(𝜃1+𝜃2)+𝑖sin(𝜃1+𝜃2)]
𝑧1/𝑧2=𝑟1/𝑟2[cos(𝜃1-𝜃2)+𝑖sin(𝜃1-𝜃2)]
この関係を利用してDe Moivre's theorem と呼ばれる以下の関係を得ることができます。
If 𝑧=𝑟(cos𝜃+𝑖sin𝜃) is a complex number, then
𝑧𝑛=𝑟𝑛[cos(𝑛𝜃)+𝑖sin(𝑛𝜃)]
n is positive integer
上記の関係は、複素数の累乗の計算を簡単に行うことを可能にします。累乗根の場合は、以下の関係を得ることができます。
To find the 𝑛th root of a complex number in polar form, use the formula given as
𝑧1𝑛=𝑟1𝑛[cos(𝜃𝑛+2𝑘𝜋𝑛)+𝑖sin(𝜃𝑛+2𝑘𝜋𝑛)]
where 𝑘=0,1,2,3,...,𝑛−1. We add 2𝑘𝜋𝑛 to 𝜃𝑛 in order to obtain the periodic roots.
この関係は、複素数の根のKさんを簡単に行うことを可能にします。
このように、複素数を極座標系で表して形式化することで、積・商・累乗・根の計算を簡単に行うことができるようになることが、今回のユニットでの最大の学びだと考えています。
この関係を利用すると、複素数の積・商・累乗・根を簡単に行うことができます。また、計算過程に記載したとおり、これらz関係は任意の複素平面上全ての点で成り立ちます。
以下では、いくつかの具体例について考えてみます。
累乗
Z=2(cospi/3+isincpi/3)についてn=2の場合
Z^{2}=2*2(cos(pi/3*2)+isinc(pi/3*2)
=4(cos(2pi/3)+isin(2pi/3))
=4(-1/2+isqrt(3)/2)
=-2+2isqrt(3)
Z=2(cospi/6+isincpi/6)についてn=6の場合
Z^{6}=2*6(cos(pi/6*6)+isinc(pi/6*6))
=12(cos(pi)+isinc(pi))
=12(-1+i*0)
=-12
累乗根
Z=2(cos(pi/3)+isin(pi/3))の2乗根
Z^{1/2}=2^{1/2}(cos(pi/(3*2)+2kpi/2)+isin(pi/(3*2)+2kpi/2))
=sqrt(2)(cos(pi/6+kpi)+isin(pi/6+kpi))
k=0の場合
Z^{1/2}=sqrt(2)(cos(pi/6)+isin(pi/6))
=sqrt(2)(sqrt(3)/2+i/2)
=sqrt(6)/2+sqrt(2)i/2
k01の場合
Z^{1/2}=sqrt(2)(cos(pi/6+pi)+isin(pi/6+pi))
=sqrt(2)(cos(7pi/6)+isin(7pi/6))
=sqrt(2)(-sqrt(3)/2-i/2)
Z=2(cos(pi/3)+isin(pi/3))の3乗根
Z^{1/3}=2^{1/3}(cos(pi/(3*3)+2kpi/3)+isin(pi/(3*3)+2kpi/3))
=2^{1/3}(cos(pi/9+2kpi/3)+isin(pi/9+2kpi/3))
k=0の場合
Z^{1/3}=2^{1/3}(cos(pi/9)+isin(pi/9))
k=1の場合
Z^{1/3}=2^{1/3}(cos(pi/9+2pi/3)+isin(pi/9+2pi/3))
=2^{1/3}(cos(5pi/9)+isin(5pi/9))
k=2の場合
Z^{1/3}=2^{1/3}(cos(pi/9+4pi/3)+isin(pi/9+4pi/3))
=2^{1/3}(cos(13pi/9)+isin(13pi/9))

### Learning Journal

### Programming Assignment
