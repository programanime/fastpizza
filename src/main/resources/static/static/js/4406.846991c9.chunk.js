"use strict";(self.webpackChunkFastspring_pizza=self.webpackChunkFastspring_pizza||[]).push([[4406],{1687:(e,s,a)=>{a.d(s,{Ud:()=>i});var n=a(5294),c=a(3708);const i=n.Z.create({baseURL:c.T,headers:{Accept:"application/json","Content-Type":"application/json"},withCredentials:!0});new Headers({Accept:"application/json"}),new Headers({Accept:"application/json"}),new Headers({Accept:"application/json","Content-Type":"application/json"}),new Headers({Accept:"application/json"}),new Headers({Accept:"application/json","Content-Type":"application/json"}),new Headers({Accept:"application/json"})},3708:(e,s,a)=>{a.d(s,{T:()=>n,c:()=>c});const n="/api/",c={PERSONAL:.5,SMALL:.7,MEDIUM:1,BIG:1.5,FAMILIAR:2,PARTY:3}},4406:(e,s,a)=>{a.r(s),a.d(s,{default:()=>r});var n=a(2791),c=a(9434),i=a(7689),t=a(2937),p=(a(3076),a(1687)),l=a(184);const r=()=>{const e=(0,c.I0)(),[s,a]=(0,n.useState)([]),r=(0,i.s0)();return(0,n.useEffect)((()=>{(async()=>{const{data:e}=await p.Ud.get("pizzas");a(e._embedded.pizzas)})()}),[]),(0,l.jsx)(l.Fragment,{children:(0,l.jsx)(t.xH,{className:"mb-4",children:(0,l.jsx)(t.sl,{children:(0,l.jsx)(t.rb,{children:s.map((s=>(0,l.jsx)(t.b7,{sm:4,children:(0,l.jsxs)(t.xH,{className:"mb-4",children:[(0,l.jsx)(t.bn,{children:(0,l.jsx)("strong",{children:s.name})}),(0,l.jsx)(t.sl,{children:(0,l.jsx)(t.DW,{fluid:!0,src:s.imageUrl,className:"pizza"})}),(0,l.jsxs)(t.Bt,{children:[(0,l.jsxs)(t.u5,{color:"outline-secondary",className:"mx-0",children:["$ ",s.price]}),(0,l.jsx)(t.u5,{color:"outline-success",className:"mx-4",onClick:()=>(s=>{e({type:"setPizza",pizza:s}),r("/order")})(s),children:"Buy"})]})]})},s.id)))})})})})}}}]);
//# sourceMappingURL=4406.846991c9.chunk.js.map