import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchproductbyIDComponent } from './searchproductby-id.component';

describe('SearchproductbyIDComponent', () => {
  let component: SearchproductbyIDComponent;
  let fixture: ComponentFixture<SearchproductbyIDComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchproductbyIDComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchproductbyIDComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
